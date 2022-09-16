package game.chessgame.dotdesign;

import game.chessgame.boarddesign.Color;

public class Bishop extends Dot{
	public Bishop(Color color, int startPointX, int startPointY) {
		super(color, startPointX, startPointY);
	}

	@Override
	public boolean canMove(int x, int y) { 
		if(!getBoardMovement().isAnyDot(x, y) || (getBoardMovement().isAnyDot(x, y) && !getBoardMovement().isSameColorDot(x, y, getColor())))
		{
			boolean isDigonally = (getX() - x) != (getY() - y);
			return  isDigonally ;	
		}
		return false;
	}
}