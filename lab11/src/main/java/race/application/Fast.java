package race.application;

import race.framework.Car;
import race.framework.CarState;

public class Fast extends CarState {
    public Fast(Car car) {
        super(car);
    }
    @Override
    public int goFaster(int speed) {
        return 3;
    }

    @Override
    public int goSlower(int speed) {
        if (speed > 80)
            return 3;
        else{
            car.setState(new Medium(car));
            return 2;
        }
    }
}