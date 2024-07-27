package game;

import game.state.LevelState;

import java.util.Random;

public class Game {
	private int totalPoints = 0;
	private int level = 1;
	private LevelState levelState;

	public void setLevelState(LevelState levelState) {
		this.levelState = levelState;
	}

	public void play() {
		Random random = new Random();
		addPoints(random.nextInt(10));
		System.out.println("points="+totalPoints+" level="+level);
	}

	public int addPoints(int newPoints) {
		levelState.addPoints(newPoints);
		return totalPoints;
	}

	public int getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
