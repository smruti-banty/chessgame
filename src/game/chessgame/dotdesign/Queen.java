package game.chessgame.dotdesign;

import game.chessgame.boarddesign.BoardMovement;
import game.chessgame.boarddesign.Color;

public class Queen extends Dot {

	public Queen() {
		super();
	}

	public Queen(Color color, BoardMovement boardMovement) {
		super(color, boardMovement);
	}

	public Queen(Color color) {
		super(color);
	}

	@Override
	public boolean canMove(int x, int y) {
		if (!getBoardMovement().isAnyDot(x, y)
				|| (getBoardMovement().isAnyDot(x, y) && !getBoardMovement().isSameColorDot(x, y, getColor()))) {
			boolean isVertically = getY() == y;
			boolean isHorizontal = getX() == x;
			boolean isDigonally = (getX() - x) != (getY() - y);
			return isHorizontal || isVertically || isDigonally;
		}
		return false;
	}

}
