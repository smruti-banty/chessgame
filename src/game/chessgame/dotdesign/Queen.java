package game.chessgame.dotdesign;

import game.chessgame.boarddesign.Color;

public class Queen extends Dot{

	public Queen(Color color, int startPointX, int startPointY) {
		super(color, startPointX, startPointY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canMove(int x, int y) {
		if(!getBoardMovement().isAnyDot(x, y) || (getBoardMovement().isAnyDot(x, y) && !getBoardMovement().isSameColorDot(x, y, getColor())))
		{
			boolean isVertically =  getY() == y;
			boolean isHorizontal =  getX() == x;
			boolean isDigonally = (getX() - x) != (getY() - y);
			return isHorizontal || isVertically || isDigonally ;
		}
		return false;
	}

}
