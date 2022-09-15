package game.chessgame.dotdesign;

import game.chessgame.boarddesign.Color;
import game.chessgame.dotutility.DotMove;

public class Rook extends Dot {

	public Rook(Color color, int startPointX, int startPointY) {
		super(color, startPointX, startPointY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canMove(int x, int y) {
		// TODO Auto-generated method stub
		if(!DotMove.isAnyDot(x, y) || (DotMove.isAnyDot(x, y) && !DotMove.isSameColorDot(x, y, getColor())))
		{
			boolean isVertically =  getY() == y;
			boolean isHorizontal =  getX() == x;
			return isHorizontal || isVertically  ? true : false;
		}
		return false;
	}

}
