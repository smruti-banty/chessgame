package game.chessgame;

import java.util.Scanner;

import game.chessgame.boarddesign.Board;
import game.chessgame.boarddesign.Color;
import game.chessgame.dotdesign.Dot;
import game.chessgame.dotutility.DotDetails;
import game.chessgame.dotutility.DotMove;
import game.chessgame.players.Player;

public class LetsPlay {
	
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
//		DotMove.start();
		Player p1 = new Player("Smruti", Color.WHITE);
		Player p2 = new Player("Rashmi", Color.BLACK);
		System.out.println("The Ultimate Chess Begin");
		System.out.println("-----------------------\n");
		
		System.out.println("Note: The top own is white and bootom own is black\n");
		
		
		Dot[][] dot = Board.getInstance().getDot();
		DotMove.start(p1, p2);
		DotDetails.showBoard();
		int quit = 0;
		int turn = 1;
		do {
			Player p = turn == 1 ? p1 : p2;
			System.out.println("\nPlayer "+ p.getPlayerName() + " turn (Color: "+p.getColor()+")");
			System.out.println("Please slect the coordinate of dot inbetween 0 to 7 inclusive\n");
			System.out.println("Please enter the coordinate of dot you want to move");
			int intialStateX = ss.nextInt();
			int intialStateY = ss.nextInt();
			System.out.println("Please enter the destination coordinate");
			int destinationX = ss.nextInt();
			int destinationY = ss.nextInt();
			
			boolean moveDot = DotMove.moveDot(destinationX, destinationY, dot[intialStateX][intialStateY], p1, p2);
			if(!moveDot) {
				System.out.println("Can't move item");
				continue;
			}
			System.out.println("PRESS 1>> Show Board");
			System.out.println("PRESS 2>> Show Your Remaining Dot");
			System.out.println("PRESS 3>> Show Opponent Remaining Dot");
			switch(ss.nextInt())
			{
			case 1: 
				DotDetails.showBoard();
				break;
			case 2: 
				DotDetails.playserDotRemaining(turn == 1 ? p1 : p2 );;
				break;
			case 3: 
				DotDetails.playserDotRemaining(turn == 1 ? p2 : p1 );;
				break;
			default:
				System.out.println("\n\n-----Invalid Option------\n");
			}
			turn = turn == 1 ? 2 : 1;
			System.out.println("For quit press -1 else 0");
			
			quit=ss.nextInt();
			
		}while(quit!=-1);
	}
}
