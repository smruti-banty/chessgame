package game.chessgame.dotutility;

import game.chessgame.boarddesign.Board;
import game.chessgame.dotdesign.Dot;
import game.chessgame.players.Player;

public class DotDetails {
	public static void showBoard() {
		System.out.println("\n--------Board---------\n");
		System.out.println("  A  B  C  D  E  F  G  H");
		System.out.println("  0  1  2  3  4  5  6  7");
		Dot[][] dot = Board.getInstance().getDot();
		for (int i = 0; i < dot.length; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < dot.length; j++) {

				System.out.print(dot[i][j] == null ? "   " : dot[i][j]);
			}
			System.out.println(i);
		}
		System.out.println("  0  1  2  3  4  5  6  7");
		System.out.println("  A  B  C  D  E  F  G  H");
	}

	public static void playserDotRemaining(Player p) {
		System.out.println("\n--------" + p.getPlayerName() + "--------\n");
		p.getAllDot().forEach((k, v) -> System.out.println(k + "==> " + v));
	}
}
