package game;

import engine.GameContainer;

public class Launch {

	public static void main(String args[]) {
		GameContainer gc = new GameContainer(new GameManager(), 1300, 650);
		gc.start();
	}
}
