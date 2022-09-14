package game.chessgame.dotutility;

import game.chessgame.boarddesign.Board;
import game.chessgame.dotdesign.Dot;
import game.chessgame.players.Player;

public class DotDetails {
	public static void showBoard()
	{
		System.out.println("\n--------Board---------\n");
		Dot[][] dot = Board.getInstance().getDot();
		for (int i = 0; i < dot.length; i++) {
			for (int j = 0; j < dot.length; j++) {
				System.out.print(dot[i][j]==null ?  "   " : dot[i][j]);
			}
			System.out.println();
		}
	}
	public static void playserDotRemaining(Player p)
	{
		System.out.println("\n--------"+p.getPlayerName()+"--------\n");
		p.getAllDot().forEach((k,v)-> System.out.println(k+"==> "+v));
	}
}
