package game.chessgame.boarddesign;

import game.chessgame.players.Player;

public class BoardViewImpl implements BoardView{
	@Override
	public void showBoard() {
		System.out.println("\n--------Board---------\n");
		System.out.println("  A  B  C  D  E  F  G  H");
		System.out.println("  0  1  2  3  4  5  6  7");
		for (int i = 0; i < Board.dot.length; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < Board.dot.length; j++) {

				System.out.print(Board.dot[i][j] == null ? "   " : Board.dot[i][j]);
			}
			System.out.println(i);
		}
		System.out.println("  0  1  2  3  4  5  6  7");
		System.out.println("  A  B  C  D  E  F  G  H");
	}
	@Override
	public void playserDotRemaining(Player p) {
		System.out.println("\n--------" + p.getPlayerName() + "--------\n");
		p.getAllDot().allCombinationOfDot().forEach((k, v) -> System.out.println(k + "==> " + v));
	}
}
