package game.chessgame.dotdesign;

import game.chessgame.boarddesign.Color;

public class Bishop extends Dot{

	public Bishop(Color color, int startPointX, int startPointY) {
		super(color, startPointX, startPointY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canMove(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}
}