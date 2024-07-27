package game.state;

import game.Game;

public class LevelTwoFive implements LevelState {

    private Game game;
    private int totalPoints;

    public LevelTwoFive(Game game, int totalPoints) {
        this.game = game;
        this.totalPoints = totalPoints;
        this.totalPoints += 1; // bonus
    }

    @Override
    public void addPoints(int newPoints) {
        if (totalPoints >= 20) {
            game.setLevelState(new ThirdLevel(game, totalPoints));
        } else {
            game.setTotalPoints(totalPoints);
        }
    }
}
