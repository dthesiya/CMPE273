import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

class Student implements Runnable {
	String name;
	String result = "";

	public Student(String name) {
		this.name = name;
	}

	public void run() {
		try {
			result = "";
			URL url = new URL("https://api.github.com/users/dthesiya/repos");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}
			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			String output;
			System.out.println(name + " : Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				result += output;
			}
			conn.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String toString() {
		return "name : " + name;
	}
}

public class MultiThreading {
	public static void main(String[] args) throws InterruptedException {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Darshit"));
		students.add(new Student("Vikas"));
		students.add(new Student("Ayush"));
		List<Thread> threads=new ArrayList<>();
		long startTime = System.nanoTime();
		for (Student student : students) {
			Thread thread=new Thread(student);
			thread.start();
			threads.add(thread);
		}
		for(Thread thread:threads){
			thread.join();
		}
		long endTime = System.nanoTime();
		System.out.println("Threading time :" + ((endTime - startTime) / 1000));
		startTime = System.nanoTime();
		for (Student student : students) {
			student.run();
		}
		endTime = System.nanoTime();
		System.out.println("Linear time :" + ((endTime - startTime) / 1000));
	}
}
