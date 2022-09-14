package game.chessgame.dotdesign;

import game.chessgame.boarddesign.Color;
import game.chessgame.dotutility.DotMove;

public class Pawn extends Dot{

	public Pawn(Color color, int startPointX, int startPointY) {
		super(color, startPointX, startPointY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canMove(int x, int y) {
		if(!DotMove.isAnyDot(x, y))
		{
			boolean isVertically=false;
			if(this.getColor()==Color.WHITE)
			 isVertically = ((getX() + 1) == x) && (getY() == y);
			else
				isVertically = ((getX() - 1) == x) && (getY() == y);
		    return isVertically;
		}else if(DotMove.isAnyDot(x, y) && !DotMove.isSameColorDot(x, y, getColor())) {
			boolean isDiagonally = (((getX() + 1) == x) ) && 
					(((getY() + 1) == y) || ((getY() - 1)== y));
			return isDiagonally;
		}
		return false;
	}

}
