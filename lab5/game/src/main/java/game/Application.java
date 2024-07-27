package game;

import game.state.FirstLevel;

public class Application {

	public static void main(String[] args) {
		Game game = new Game();
		game.setLevelState(new FirstLevel(game));
		game.play();
		game.play();
		game.play();
		game.play();
		game.play();

	}

}
