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
