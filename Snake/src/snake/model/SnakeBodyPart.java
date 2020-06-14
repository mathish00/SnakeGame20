package snake.model;

import java.awt.Point;

public class SnakeBodyPart {

	private Point position;
	private Direction dir;
	protected SnakeBodyPart next;
	
	public SnakeBodyPart(int x, int y, Direction dir) {
		position = new Point(x, y);
		this.dir = dir;
	}
	
	protected void move() {
		if(getDirection() == Direction.UP) {
			setCoordinates(getX(), getY() + 1);
		}
		if(getDirection() == Direction.DOWN) {
			setCoordinates(getX(), getY() - 1);
		}
		if(getDirection() == Direction.LEFT) {
			setCoordinates(getX() - 1, getY());
		}
		if(getDirection() == Direction.RIGHT) {
			setCoordinates(getX() + 1, getY());
		}
		if(next != null) {
			next.setDirection(dir);
		}
	}
	
	public void setCoordinates(int x, int y) {
		position = new Point(x, y);
	}
	
	public int getX() {
		return position.x;
	}
	
	public int getY() {
		return position.y;
	}
	
	public void setDirection(Direction dir) {
		this.dir = dir;
	}
	
	public Direction getDirection() {
		return dir;
	}
}
