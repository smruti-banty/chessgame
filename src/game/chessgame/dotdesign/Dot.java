package game.chessgame.dotdesign;

import java.util.UUID;

import game.chessgame.boarddesign.BoardMovement;
import game.chessgame.boarddesign.BoardUtility;
import game.chessgame.boarddesign.Color;

public abstract class Dot implements IDot {
	private Color color;
	private int x;
	private int y;
	private UUID uuid;
	private String dotName;
	private BoardMovement boardMovement;
	public Dot()
	{
		boardMovement=(BoardMovement) BoardUtility.getInstance("BoardMovement");
		uuid= UUID.randomUUID();
		dotName = getClass().getSimpleName();
	}
	public Dot(Color color)
	{
		this.color=color;
		boardMovement=(BoardMovement) BoardUtility.getInstance("BoardMovement");
		uuid= UUID.randomUUID();
		dotName = getClass().getSimpleName();
	}
	public Dot(Color color, BoardMovement boardMovement)
	{
		this.color=color;
		this.boardMovement=boardMovement;
		uuid= UUID.randomUUID();
		dotName = getClass().getSimpleName();
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public BoardMovement getBoardMovement() {
		return boardMovement;
	}
	public void setBoardMovement(BoardMovement boardMovement) {
		this.boardMovement = boardMovement;
	}
	public String getDotName() {
		return dotName;
	}
	public void setDotName(String dotName) {
		this.dotName = dotName;
	}
	public UUID getUuid() {
		return uuid;
	}
	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Color getColor() {
		return color;
	}
	@Override
	public String toString() {
		return  dotName.substring(0,2) ;
	}
	
}
