package snake.controller;

import snake.model.Direction;
import snake.model.Snake;

public class GameController {

	int height;
	int width;
	
	Snake snake = new Snake(13, 15, Direction.RIGHT, this);
}
