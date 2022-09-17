package game.chessgame.dotdesign;

import game.chessgame.boarddesign.BoardMovement;
import game.chessgame.boarddesign.Color;

public class Bishop extends Dot{
	public Bishop() {
	}
	public Bishop(Color color) {
		super(color);
	}
	public Bishop(Color color, BoardMovement boardMovement) {
		super(color,boardMovement);
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