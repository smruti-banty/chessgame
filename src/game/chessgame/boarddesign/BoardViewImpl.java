package game.chessgame.boarddesign;

import game.chessgame.players.Player;

public class BoardViewImpl implements BoardView{
	private final String SLASH_N_WITH_DASH = "\n------------";
	private final String DASH_WITH_SLASH_N = new StringBuffer(SLASH_N_WITH_DASH).reverse().toString();
	private final String ALPHABET_DESIGN = "  A  B  C  D  E  F  G  H";
	private final String NUMERIC_DESIGN = "  0  1  2  3  4  5  6  7";
	private final String SPACE = " ";
	private final String EQUAL_WITH_ARROW = "==> ";
	@Override
	/**
	 * <h1>Current Dot Position In the Board</h1>
	 * 
	 */
	public void showBoard() {
		System.out.println(SLASH_N_WITH_DASH.concat("Board").concat(DASH_WITH_SLASH_N));
		System.out.println(ALPHABET_DESIGN);
		System.out.println(NUMERIC_DESIGN);
		for (int i = 0; i < Board.dot.length; i++) {
			System.out.print(i + SPACE);
			for (int j = 0; j < Board.dot.length; j++) {
				System.out.print(null == Board.dot[i][j] ? SPACE.concat(SPACE).concat(SPACE) : Board.dot[i][j] + SPACE);
			}
			System.out.println(i);
		}
		System.out.println(NUMERIC_DESIGN);
		System.out.println(ALPHABET_DESIGN);
	}
	
	@Override
	/**
	 * <h1>Player Dot Remains</h1>
	 * @param Player
	 */
	public void playersDotRemaining(Player p) {
		System.out.println(SLASH_N_WITH_DASH.concat(p.getPlayerName()).concat(DASH_WITH_SLASH_N));
		p.getAllDot().allCombinationOfDot().forEach((k, v) -> System.out.println(k.concat(EQUAL_WITH_ARROW) + v));
	}
}
