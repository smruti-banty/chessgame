package game.chessgame.boarddesign;

import game.chessgame.dotdesign.Bishop;
import game.chessgame.dotdesign.Dot;
import game.chessgame.dotdesign.King;
import game.chessgame.dotdesign.Knight;
import game.chessgame.dotdesign.Pawn;
import game.chessgame.dotdesign.Queen;
import game.chessgame.dotdesign.Rook;
import game.chessgame.players.Player;

public class BoardMoveImpl implements BoardMovement {
	@Override
	public boolean moveDot(int intialX, int intialY, int destinationX, int destinationY, Player p, Player opposition) {
		Dot dt = dot[intialX][intialY];
		if (dt.canMove(destinationX, destinationY)) {
			if (isAnyDot(destinationX, destinationY) && !isSameColorDot(destinationX, destinationY, dt.getColor())) {
				Dot oppositionDot = Board.dot[destinationX][destinationY];
				opposition.getAllDot().allCombinationOfDot().put(oppositionDot.getDotName(),
						opposition.getAllDot().allCombinationOfDot().get(oppositionDot.getDotName()) - 1);
				if (oppositionDot.getDotName().equals("King")) {
					System.out.println("\n--------Congratulation--------");
					System.out.println("Player " + p.getPlayerName() + " Winner");
					System.out.println("\n--------Game Over--------\n");
					System.exit(0);
				}

			}
			setMove(dt.getX(), dt.getY(), null);
			setMove(destinationX, destinationY, dt);
			return true;
		}
		return false;
	}

	@Override
	public boolean isAnyDot(int x, int y) {
		return Board.dot[x][y] != null;
	}

	@Override
	public boolean isSameColorDot(int x, int y, Color color) {
		return Board.dot[x][y].getColor() == color;
	}

	@Override
	public void setMove(int x, int y, Dot dot) {
		if (dot != null) {
			dot.setX(x);
			dot.setY(y);
		}
		Board.dot[x][y] = dot;
	}

	@Override
	public void start(Player p1, Player p2) {
		setMove(0, 0, new Rook(p1.getColor()));
		setMove(0, 7, new Rook(p1.getColor()));

		setMove(7, 0, new Rook(p2.getColor()));
		setMove(7, 7, new Rook(p2.getColor()));

		setMove(0, 1, new Knight(p1.getColor()));
		setMove(0, 6, new Knight(p1.getColor()));

		setMove(7, 1, new Knight(p2.getColor()));
		setMove(7, 6, new Knight(p2.getColor()));

		setMove(0, 2, new Bishop(p1.getColor()));
		setMove(0, 5, new Bishop(p1.getColor()));

		setMove(7, 2, new Bishop(p2.getColor()));
		setMove(7, 5, new Bishop(p2.getColor()));

		setMove(0, 3, new Queen(p1.getColor()));
		setMove(7, 3, new Queen(p2.getColor()));

		setMove(0, 4, new King(p1.getColor()));
		setMove(7, 4, new King(p2.getColor()));

		for (int i = 0; i < 8; i++) {
			setMove(1, i, new Pawn(p1.getColor()));
			setMove(6, i, new Pawn(p2.getColor()));
		}

	}

}
