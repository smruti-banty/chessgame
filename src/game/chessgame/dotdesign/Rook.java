package game.chessgame.dotdesign;

import game.chessgame.boarddesign.BoardMovement;
import game.chessgame.boarddesign.Color;

public class Rook extends Dot {

	public Rook() {
		super();
	}

	public Rook(Color color, BoardMovement boardMovement) {
		super(color, boardMovement);
	}

	public Rook(Color color) {
		super(color);
	}

	@Override
	public boolean canMove(int x, int y) {
		// TODO Auto-generated method stub
		if (!getBoardMovement().isAnyDot(x, y)
				|| (getBoardMovement().isAnyDot(x, y) && !getBoardMovement().isSameColorDot(x, y, getColor()))) {
			boolean isVertically = getY() == y;
			boolean isHorizontal = getX() == x;
			return isHorizontal || isVertically ? true : false;
		}
		return false;
	}

}
