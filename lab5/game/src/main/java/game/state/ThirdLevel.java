package game.state;

import game.Game;

public class ThirdLevel implements LevelState {

    private Game game;
    private int totalPoints;

    public ThirdLevel(Game game, int totalPoints) {
        this.game = game;
        this.totalPoints = totalPoints;
        this.totalPoints += 2; // bonus
        game.setLevel(3);
    }

    @Override
    public void addPoints(int newPoints) {
        totalPoints = totalPoints + 3 * newPoints;
        game.setTotalPoints(totalPoints);
    }
}
