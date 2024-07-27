package game.state;

import game.Game;

public class SecondLevel implements LevelState {

    private Game game;
    private int totalPoints;

    public SecondLevel(Game game, int totalPoints) {
        this.game = game;
        this.totalPoints = totalPoints;
        this.totalPoints += 1;//add 1 bonus point
        game.setLevel(2);
    }

    @Override
    public void addPoints(int newPoints) {
        totalPoints = totalPoints + 2 * newPoints;
        if (totalPoints >= 15) {
            game.setLevelState(new LevelTwoFive(game, totalPoints));
        } else {
            game.setTotalPoints(totalPoints);
        }
    }
}
