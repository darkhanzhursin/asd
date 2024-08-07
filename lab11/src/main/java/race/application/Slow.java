package race.application;

import race.framework.Car;
import race.framework.CarState;

public class Slow extends CarState {
    public Slow(Car car) {
        super(car);
    }

    @Override
    public int goFaster(int speed) {
        if (speed < 40)
           return 1;
        else{
            car.setState(new Medium(car));
            return 2;
        }
    }

    @Override
    public int goSlower(int speed) {
        return 1;
    }
}
