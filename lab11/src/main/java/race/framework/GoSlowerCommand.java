package race.framework;


public class GoSlowerCommand implements ICommand{
	private Car car;
	
	
	public GoSlowerCommand(Car car) {
		this.car = car;
	}

	public void execute() {
		car.goSlower();
	}

	public void unExecute() {
		car.goFaster();
	}

}
