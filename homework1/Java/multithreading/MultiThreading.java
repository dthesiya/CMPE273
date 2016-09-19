import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

class Student implements Runnable {
	String name;
	String githubId;
	String result = "";

	public Student(String name, String githubId) {
		this.name = name;
		this.githubId = githubId;
	}

	public void run() {
		try {
			result = "";
			URL url = new URL("https://api.github.com/users/"+githubId+"/repos");
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
	
	public String getResult(){
		return result;
	}

	public String toString() {
		return "name : " + name;
	}
}

public class MultiThreading implements Executor {
	public void execute(Runnable runnable) {
		// TODO Auto-generated method stub
		runnable.run();
	}

	public static void main(String[] args) throws InterruptedException {
		Executor executor = new MultiThreading();
		List<Student> students = new ArrayList<>();
		students.add(new Student("Darshit","dthesiya"));
		students.add(new Student("Vikas","vikasmiyani"));
		students.add(new Student("Ronak","ronakdborad"));
		for (Student student : students) {
			executor.execute(student);
		}
		
		for (Student student : students) {
			System.out.println(student.result);
		}
	}
}
