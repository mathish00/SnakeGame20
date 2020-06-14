package snake.controller;

import snake.model.Direction;
import snake.model.Snake;

public class GameController {

	int height;
	int width;
	
	String str = "this is another version of the project which is have just edited";
	
	Snake snake = new Snake(13, 15, Direction.RIGHT, this);

	private void gitTest() {
		System.out.println("Theres the push!");
		System.out.println(str);

	}
}
