package game.chessgame.dotdesign;

import game.chessgame.boarddesign.Color;
import game.chessgame.dotutility.DotMove;

public class King extends Dot{

	public King(Color color, int startPointX, int startPointY) {
		super(color, startPointX, startPointY);
	}

	@Override
	public boolean canMove(int x, int y) {
		
		if(!DotMove.isAnyDot(x, y) || (DotMove.isAnyDot(x, y) && !DotMove.isSameColorDot(x, y, getColor())))
		{
			boolean isVertically = (((getX() + 1) == x) || ((getX() - 1)== x)) && getY() == y;
			boolean isHorizontal = (((getY() + 1) == y) || ((getY() - 1)== y)) && getX() == x;
			boolean isDigonally = (((getX() + 1) == x) || ((getX() - 1)== x)) && 
					(((getY() + 1) == y) || ((getY() - 1)== y));
			return isHorizontal || isVertically || isDigonally ? true : false;
			
		}
		return false;
		
	}

}