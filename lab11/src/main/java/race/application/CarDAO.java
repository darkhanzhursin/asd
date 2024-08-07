package race.application;

import race.framework.Observer;

public class CarDAO implements Observer {
    @Override
    public void update(int speed) {
        System.out.println("CarDAO: Saving car speed :"+speed);
    }
}