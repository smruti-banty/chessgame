package game.chessgame.boarddesign;

import game.chessgame.dotdesign.Dot;
import game.chessgame.players.Player;

public interface BoardMovement extends Board {
	boolean moveDot(int initialX, int initialY, int destinationX,int destinationY, Player p, Player opposition);
	public boolean isAnyDot(int x, int y);
	public boolean isSameColorDot(int x, int y, Color color);
	public void setMove(int x, int y, Dot dot);
	public void start(Player p1, Player p2);
	
}
