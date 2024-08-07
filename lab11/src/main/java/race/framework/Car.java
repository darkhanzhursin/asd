package race.framework;

public class Car extends Subject {
	CarState state;
	
	private int speed=0;
	
	public void goFaster(){
		speed=speed + state.goFaster(speed);
    	donotify(speed);
	}
	
	public void goSlower(){
		speed=speed - state.goSlower(speed);
    	donotify(speed);
	}

	public void setState(CarState state) {
		this.state = state;
	}


	public int getSpeed() {
		return speed;
	}
}
