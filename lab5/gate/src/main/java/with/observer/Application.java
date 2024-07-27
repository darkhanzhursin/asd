package with.observer;

import with.observer.state.ClosedState;

public class Application {

	public static void main(String[] args) {
	Remote remote = new Remote();
	Sensor sensor = new Sensor();

	GateController gateController = new GateController();
	gateController.setState(new ClosedState(gateController));

	remote.setGateController(gateController);
	sensor.setGateController(gateController);
	BuzzerController buzzerController= new BuzzerController();
	Gate gate = new Gate();

	gateController.addPropertyChangeListener(buzzerController);
	gateController.addPropertyChangeListener(gate);


	remote.pressButton();
	sensor.sensorOpenSignal();

	remote.pressButton();
	sensor.sensorCloseSignal();

	}
}
