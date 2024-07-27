package with.observer.state;

import with.observer.GateController;

public class ClosingState extends MyGateState {

    public ClosingState(GateController gateController) {
        super(gateController);
        support = gateController.getSupport();
    }

    @Override
    public void pressButton() {
        gateController.setState(new OpeningState(gateController));
        support.firePropertyChange("opening", GateState.CLOSING, GateState.OPENING);
        gateController.setSupport(support);
    }

    @Override
    public void sensorOpenSignal() {
        System.out.println("This is not possible");
    }

    @Override
    public void sensorCloseSignal() {
        gateController.setState(new ClosedState(gateController));
        support.firePropertyChange("closed", GateState.CLOSING, GateState.CLOSED);
        gateController.setSupport(support);
    }
}
