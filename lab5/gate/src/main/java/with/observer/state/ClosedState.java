package with.observer.state;

import with.observer.GateController;

public class ClosedState extends MyGateState {

    public ClosedState(GateController gateController) {
        super(gateController);
        support = gateController.getSupport();
    }

    @Override
    public void pressButton() {
        gateController.setState(new OpeningState(gateController));
        support.firePropertyChange("opening", GateState.CLOSED, GateState.OPENING);
        gateController.setSupport(support);
    }

    @Override
    public void sensorOpenSignal() {
        System.out.println("This is not possible");
    }

    @Override
    public void sensorCloseSignal() {
        System.out.println("This is not possible");
    }
}
