package game.chessgame.dotdesign;

import game.chessgame.boarddesign.Color;
import game.chessgame.dotutility.DotMove;

public class Bishop extends Dot{

	public Bishop(Color color, int startPointX, int startPointY) {
		super(color, startPointX, startPointY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canMove(int x, int y) {
		// TODO Auto-generated method stub
		if(!DotMove.isAnyDot(x, y) || (DotMove.isAnyDot(x, y) && !DotMove.isSameColorDot(x, y, getColor())))
		{
			
			boolean isDigonally = (getX() - x) != (getY() - y);
			return  isDigonally ;
			
		}
		return false;
	}
}