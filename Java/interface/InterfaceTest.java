import static org.junit.Assert.*;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InterfaceTest {
	Interface interf;

	@Before
	public void setUp() throws Exception {
		interf = new Interface();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testChessPieces() {
		List<ChessInterface> list = interf.chessPieces();
		ChessInterface knight = list.get(0);
		ChessInterface rook = list.get(1);
		ChessInterface bishop = list.get(2);
		ChessInterface queen = list.get(3);
		//knight moves
		assertFalse(knight.moveDiagonally());
		assertFalse(knight.moveHorizontally());
		assertFalse(knight.moveVertically());
		//rook moves
		assertFalse(rook.moveDiagonally());
		assertTrue(rook.moveHorizontally());
		assertTrue(rook.moveVertically());
		//bishop moves
		assertTrue(bishop.moveDiagonally());
		assertFalse(bishop.moveHorizontally());
		assertFalse(bishop.moveVertically());
		//queen moves
		assertTrue(queen.moveDiagonally());
		assertTrue(queen.moveHorizontally());
		assertTrue(queen.moveVertically());
	}

}
