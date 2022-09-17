package game.chessgame.dotdesign;

import game.chessgame.boarddesign.BoardMovement;
import game.chessgame.boarddesign.Color;

public class Pawn extends Dot {

	public Pawn() {
		super();
	}

	public Pawn(Color color, BoardMovement boardMovement) {
		super(color, boardMovement);
	}

	public Pawn(Color color) {
		super(color);
	}

	@Override
	public boolean canMove(int x, int y) {
		if (!getBoardMovement().isAnyDot(x, y)) {
			boolean isVertically = false;
			if (this.getColor() == Color.WHITE)
				isVertically = ((getX() + 1) == x) && (getY() == y);
			else
				isVertically = ((getX() - 1) == x) && (getY() == y);
			return isVertically;
		} else if (getBoardMovement().isAnyDot(x, y) && !getBoardMovement().isSameColorDot(x, y, getColor())) {
			boolean isDiagonally = (((getX() + 1) == x)) && (((getY() + 1) == y) || ((getY() - 1) == y));
			return isDiagonally;
		}
		return false;
	}

}
