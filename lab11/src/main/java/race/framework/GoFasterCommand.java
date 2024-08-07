package race.framework;


public class GoFasterCommand implements ICommand{
	private Car car;
	
	
	public GoFasterCommand(Car car) {
		this.car = car;
	}

	public void execute() {
		car.goFaster();
	}


	public void unExecute() {
		car.goSlower();
	}

}
