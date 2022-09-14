package game.chessgame.dotdesign;

import game.chessgame.boarddesign.Color;

public class Knight extends Dot{

	public Knight(Color color, int startPointX, int startPointY) {
		super(color, startPointX, startPointY);
	}

	@Override
	public boolean canMove(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

}
