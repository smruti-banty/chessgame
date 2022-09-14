package game.chessgame.boarddesign;

import game.chessgame.dotdesign.Dot;

public class Board {
	private final Dot[][] dot = new Dot[8][8];
	private static Board board;
	private Board() {}
	public static Board getInstance()
	{
		if(board==null)
		  board=new Board();
		return board;
	}
	public Dot[][] getDot() {
		return dot;
	}
	public static Board getBoard() {
		return board;
	}
	public static void setBoard(Board board) {
		Board.board = board;
	}
	
}
