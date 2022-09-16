package game.chessgame.boarddesign;

public class BoardUtility {
	public static Board getInstance(String type) {
		if(type.equalsIgnoreCase("BoardMovement"))
			return new BoardMoveImpl();
		if(type.equalsIgnoreCase("BoardView"))
			return new  BoardViewImpl();
		return null;
	}
}
