package game.chessgame.boarddesign;

import game.chessgame.players.Player;

public interface BoardView extends Board{
	public void showBoard();
	public void playersDotRemaining(Player p);
}
