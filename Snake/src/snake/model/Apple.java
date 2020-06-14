package snake.model;

import java.awt.Point;

public class Apple {

	private Point position;
	
	public Apple(int x, int y) {
		position = new Point(x, y);
	}
	
	public Point getPosition() {
		return position;
	}
}
