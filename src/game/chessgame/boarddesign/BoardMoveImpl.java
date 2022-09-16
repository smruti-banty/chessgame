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
	public boolean moveDot(int intialX,int intialY,int destinationX, int destinationY, Player p, Player opposition) {
		Dot dt = dot[intialX][intialY];
		if (dt.canMove(destinationX, destinationY)) {
			if (isAnyDot(destinationX, destinationY) && !isSameColorDot(destinationX, destinationY, dt.getColor())) {
				Dot oppositionDot = Board.dot[destinationX][destinationY];
				opposition.getAllDot().put(oppositionDot.getDotName(),
						opposition.getAllDot().get(oppositionDot.getDotName()) - 1);
				if (oppositionDot.getDotName().equals("King")) {
					System.out.println("\n--------Congratulation--------");
					System.out.println("Player " + p.getPlayerName() + " Winner");
					System.out.println("\n--------Game Over--------\n");
					System.exit(0);
				}

			}
			setMove(dt.getX(), dt.getY(), null);
			dt.setX(destinationX);
			dt.setY(destinationY);
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
		Board.dot[x][y] = dot;
	}
	@Override
	public void start(Player p1, Player p2) {
		Dot[][] dot = Board.dot;
		dot[0][0] = new Rook(p1.getColor(), 0, 0);
		dot[0][7] = new Rook(p1.getColor(), 0, 7);

		dot[7][0] = new Rook(p2.getColor(), 7, 0);
		dot[7][7] = new Rook(p2.getColor(), 7, 7);

		dot[0][1] = new Knight(p1.getColor(), 0, 1);
		dot[0][6] = new Knight(p1.getColor(), 0, 6);

		dot[7][1] = new Knight(p2.getColor(), 7, 1);
		dot[7][6] = new Knight(p2.getColor(), 7, 6);

		dot[0][2] = new Bishop(p1.getColor(), 0, 2);
		dot[0][5] = new Bishop(p1.getColor(), 0, 5);

		dot[7][2] = new Bishop(p2.getColor(), 7, 2);
		dot[7][5] = new Bishop(p2.getColor(), 7, 5);

		dot[0][3] = new Queen(p1.getColor(), 0, 3);
		dot[7][3] = new Queen(p2.getColor(), 7, 3);

		dot[0][4] = new King(p1.getColor(), 0, 4);
		dot[7][4] = new King(p2.getColor(), 7, 4);

		for (int i = 0; i < 8; i++) {
			dot[1][i] = new Pawn(p1.getColor(), 1, i);
			dot[6][i] = new Pawn(p2.getColor(), 6, i);
		}

	}
	
}
