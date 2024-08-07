package race.framework;

import race.framework.Car;

public abstract class CarState {
	protected Car car;

	public CarState(Car car) {
		this.car = car;
	}

	public abstract int goFaster(int speed);
	public abstract int goSlower(int speed);

}
