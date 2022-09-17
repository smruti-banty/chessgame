package game.chessgame.dotdesign;

import game.chessgame.boarddesign.BoardMovement;
import game.chessgame.boarddesign.Color;

public class Knight extends Dot {

	public Knight() {
		super();
	}

	public Knight(Color color, BoardMovement boardMovement) {
		super(color, boardMovement);
	}

	public Knight(Color color) {
		super(color);
	}

	@Override
	public boolean canMove(int x, int y) {
		if (!getBoardMovement().isAnyDot(x, y)
				|| (getBoardMovement().isAnyDot(x, y) && !getBoardMovement().isSameColorDot(x, y, getColor()))) {
			boolean isLShsape = ((getY() - y) == 2 && (getX() - x) == 1) || ((getX() - x) == 2 && (getY() - y) == 1);
			return isLShsape;
		}
		return false;
	}

}
