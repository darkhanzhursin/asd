package race.application;

import race.framework.Car;
import race.framework.CarState;

public class Medium extends CarState {
    public Medium(Car car) {
        super(car);
    }
    @Override
    public int goFaster(int speed) {
        if (speed < 80)
            return 2;
        else{
            car.setState(new Fast(car));
            return 3;
        }
    }

    @Override
    public int goSlower(int speed) {
        if (speed > 40)
            return 2;
        else{
            car.setState(new Slow(car));
            return 1;
        }
    }
}
