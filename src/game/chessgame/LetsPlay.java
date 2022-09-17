package game.chessgame;

import java.util.*;
import java.util.Scanner;

import game.chessgame.boarddesign.BoardMovement;
import game.chessgame.boarddesign.BoardUtility;
import game.chessgame.boarddesign.BoardView;
import game.chessgame.boarddesign.Color;
import game.chessgame.players.Player;

public class LetsPlay {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		LetsPlay letsPlay = new LetsPlay();
		System.out.println("Enter player1 name");
		Player p1 = new Player(ss.next(), Color.WHITE, letsPlay::allDotCombination);
		System.out.println("Enter player2 name");
		Player p2 = new Player(ss.next(), Color.BLACK, letsPlay::allDotCombination);
		System.out.println("The Ultimate Chess Begin");
		System.out.println("-----------------------\n");
		System.out.println("Note: The top own is WHITE and bootom own is BLACK\n");
		letsPlay.gameBegin(p1, p2, ss);
		ss.close();
	}

	public void gameBegin(Player p1, Player p2, Scanner ss) {
		BoardMovement bm = (BoardMovement) BoardUtility.getInstance("BoardMovement");
		BoardView bv = (BoardView) BoardUtility.getInstance("BoardView");
		bm.start(p1, p2);
		bv.showBoard();
		int quit = 0;
		int turn = 1;
		do {
			Player p = turn == 1 ? p1 : p2;
			System.out.println("\nPlayer " + p.getPlayerName() + " turn (Color: " + p.getColor() + ")");
			System.out.println("Please slect the coordinate of dot inbetween 0 to 7 inclusive\n");
			System.out.println("Please enter the coordinate of dot you want to move");
			int intialStateX = ss.nextInt();
			int intialStateY = ss.nextInt();
			System.out.println("Please enter the destination coordinate");
			int destinationX = ss.nextInt();
			int destinationY = ss.nextInt();
			boolean moveDot = bm.moveDot(intialStateX, intialStateY, destinationX, destinationY, p1, p2);
			if (!moveDot) {
				System.out.println("Can't move item");
				continue;
			}
			System.out.println("PRESS 1>> Show Board");
			System.out.println("PRESS 2>> Show Your Remaining Dot");
			System.out.println("PRESS 3>> Show Opponent Remaining Dot");
			switch (ss.nextInt()) {
			case 1:
				bv.showBoard();
				break;
			case 2:
				bv.playserDotRemaining(turn == 1 ? p1 : p2);
				;
				break;
			case 3:
				bv.playserDotRemaining(turn == 1 ? p2 : p1);
				;
				break;
			default:
				System.out.println("\n\n-----Invalid Option------\n");
			}
			turn = turn == 1 ? 2 : 1;
			System.out.println("For quit press -1 else 0");

			quit = ss.nextInt();

		} while (quit != -1);
	}

	public Map<String, Integer> allDotCombination() {
		Map<String, Integer> dots = new HashMap<>();
		dots.put("King", 1);
		dots.put("Queen", 1);
		dots.put("Bishop", 2);
		dots.put("Knight", 2);
		dots.put("Rook", 2);
		dots.put("Pawn", 8);
		return dots;
	}
}
