package game.chessgame.players;

import java.util.HashMap;
import java.util.Map;

import game.chessgame.boarddesign.Color;

public class Player {
	private String playerName;
	private Color color;
	private Map<String,Integer> allDot;
	public Player(String playerName,Color color) {
		this.playerName = playerName;
		this.allDot = getCombinatioOfAllDot();
		this.color=color;
	}
	private Map<String, Integer> getCombinatioOfAllDot() { 
		Map<String, Integer> dots = new HashMap<>();
		dots.put("King", 1);
		dots.put("Queen", 1);
		dots.put("Bishop", 2);
		dots.put("Knight", 2);
		dots.put("Rook", 2);
		dots.put("Pawn", 8);
		return dots;
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
	public Map<String, Integer> getAllDot() {
		return allDot;
	}
	
}
