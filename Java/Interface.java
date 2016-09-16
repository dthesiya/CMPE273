interface ChessInterface {
	String move();

	boolean moveHorizontally();

	boolean moveVertically();

	boolean moveDiagonally();
}

class Knight implements ChessInterface {
	public String move() {
		return "move to a square that is two squares horizontally and one square vertically, or two squares vertically and one square horizontally";
	}

	public boolean moveHorizontally() {
		return false;
	}

	public boolean moveVertically() {
		return false;
	}

	public boolean moveDiagonally() {
		return false;
	}
}

class Rook implements ChessInterface {
	public String move() {
		return "move horizontally or vertically, through any number of unoccupied squares";
	}

	public boolean moveHorizontally() {
		return true;
	}

	public boolean moveVertically() {
		return true;
	}

	public boolean moveDiagonally() {
		return false;
	}
}

class Bishop implements ChessInterface {
	public String move() {
		return "move diagonally, all the way until it meets an obstacle (end of board or a piece)";
	}

	public boolean moveHorizontally() {
		return false;
	}

	public boolean moveVertically() {
		return false;
	}

	public boolean moveDiagonally() {
		return true;
	}
}

class Queen implements ChessInterface {
	public String move() {
		return "move any number of squares vertically, horizontally or diagonally";
	}

	public boolean moveHorizontally() {
		return true;
	}

	public boolean moveVertically() {
		return true;
	}

	public boolean moveDiagonally() {
		return true;
	}
}

public class Interface {
	public static void main(String[] args) {
		ChessInterface knight = new Knight();
		ChessInterface rook = new Rook();
		ChessInterface bishop = new Bishop();
		ChessInterface queen = new Queen();

		System.out.println("-------Knight--------");
		System.out.println(knight.move());
		System.out.println("can move diagonally ? : " + knight.moveDiagonally());
		System.out.println("can move horizontally ? : " + knight.moveHorizontally());
		System.out.println("can move vertically ? : " + knight.moveVertically());
		System.out.println("-------Rook--------");
		System.out.println(rook.move());
		System.out.println("can move diagonally ? : " + rook.moveDiagonally());
		System.out.println("can move horizontally ? : " + rook.moveHorizontally());
		System.out.println("can move vertically ? : " + rook.moveVertically());
		System.out.println("-------Bishop--------");
		System.out.println(bishop.move());
		System.out.println("can move diagonally ? : " + bishop.moveDiagonally());
		System.out.println("can move horizontally ? : " + bishop.moveHorizontally());
		System.out.println("can move vertically ? : " + bishop.moveVertically());
		System.out.println("-------Queen--------");
		System.out.println(queen.move());
		System.out.println("can move diagonally ? : " + queen.moveDiagonally());
		System.out.println("can move horizontally ? : " + queen.moveHorizontally());
		System.out.println("can move vertically ? : " + queen.moveVertically());
	}
}
