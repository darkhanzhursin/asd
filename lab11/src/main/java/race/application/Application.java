package race.application;

import race.framework.*;

public class Application {

    public static void main(String[] args) {
        HistoryList historyList = new HistoryList();
        JumpingCar car = new JumpingCar();
        CarState slow = new Slow(car);
        car.setState(slow);


        Logger logger = new Logger();
        CarDAO carDAO = new CarDAO();
        car.addObserver(logger);
        car.addObserver(carDAO);

        for (int x=0; x<65 ; x++){
            GoFasterCommand goFasterCommand = new GoFasterCommand(car);
            goFasterCommand.execute();
        }
        car.jump();
        for (int x=0; x<50 ; x++){
            GoSlowerCommand goSlowerCommand = new GoSlowerCommand(car);
            goSlowerCommand.execute();
        }
        car.jump();
    }
}
