package game.chessgame.dotdesign;

import java.util.UUID;

import game.chessgame.boarddesign.Color;

public abstract class Dot {
	private final Color color;
	private int x;
	private int y;
	private UUID uuid;
	private String dotName;
	public Dot(Color color,int startPointX,int startPointY) {
		this.color = color;
		this.x=startPointX;
		this.y=startPointY;
		this.dotName = getClass().getSimpleName();
		uuid=UUID.randomUUID();
	}
	public abstract boolean canMove(int x,int y);
	
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
		return  dotName.substring(0,2)+" " ;
	}
	
}
