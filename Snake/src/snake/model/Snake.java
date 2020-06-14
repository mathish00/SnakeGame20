package snake.model;

import java.awt.Point;
import java.util.LinkedList;

import snake.controller.GameController;

public class Snake {

	private SnakeBodyPart head;
	private int length;
	
	public Snake(int x, int y, Direction dir, GameController gc) {
		head = new SnakeBodyPart(x, y, dir);
		length = 1;
	}
	
	public void move() {
		head.move();
	}
	
	public void eat() {
		SnakeBodyPart p = head;
		while(p.next != null) {
			p = p.next;
		}
		Direction dir = p.getDirection();
		if(dir == Direction.UP) {
			p.next = new SnakeBodyPart(p.getX(), p.getY() - 1, dir);
		}
		if(dir == Direction.DOWN) {
			p.next = new SnakeBodyPart(p.getX(), p.getY() + 1, dir);
		}
		if(dir == Direction.LEFT) {
			p.next = new SnakeBodyPart(p.getX() + 1, p.getY(), dir);
		}
		if(dir == Direction.RIGHT) {
			p.next = new SnakeBodyPart(p.getX() - 1, p.getY(), dir);
		}
	}
}
