package game.chessgame.dotdesign;

import game.chessgame.boarddesign.BoardMovement;
import game.chessgame.boarddesign.Color;

public class King extends Dot{

	public King() {
		super();
	}

	public King(Color color, BoardMovement boardMovement) {
		super(color, boardMovement);
	}

	public King(Color color) {
		super(color);
	}

	@Override
	public boolean canMove(int x, int y) {
		
		if(!getBoardMovement().isAnyDot(x, y) || (getBoardMovement().isAnyDot(x, y) && !getBoardMovement().isSameColorDot(x, y, getColor())))
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
