package game.chessgame.dotdesign;

import game.chessgame.boarddesign.Color;

public class Knight extends Dot{

	public Knight(Color color, int startPointX, int startPointY) {
		super(color, startPointX, startPointY);
	}

	@Override
	public boolean canMove(int x, int y) {
		// TODO Auto-generated method stub
		if(!getBoardMovement().isAnyDot(x, y) || (getBoardMovement().isAnyDot(x, y) && !getBoardMovement().isSameColorDot(x, y, getColor())))
		{
			boolean isLShsape = ((getY()-y)==2 && (getX()-x)==1) || ((getX()-x)==2 && (getY()-y)==1);
			return isLShsape;
		}
		return false;
	}

}
