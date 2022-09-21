package game.chessgame.players;


import game.chessgame.boarddesign.Color;

public class Player {
	private String playerName;
	private Color color;
	private AllDot allDot;

	public Player(String playerName, Color color, AllDot allDot) {
		this.playerName = playerName;
		this.color = color;
		this.allDot = allDot;
	}
	
	public AllDot getAllDot() {
		return allDot;
	}

	public void setAllDot(AllDot allDot) {
		this.allDot = allDot;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
