package game.state;

import game.Game;

public class FirstLevel implements LevelState {

    private Game game;
    private int totalPoints;

    public FirstLevel(Game game) {
        this.game = game;
        totalPoints = game.getTotalPoints();
    }

    @Override
    public void addPoints(int newPoints) {
        totalPoints += newPoints;
        if (totalPoints > 10) {
            game.setLevelState(new SecondLevel(game, totalPoints));
        } else {
            game.setTotalPoints(totalPoints);
        }
    }

}
