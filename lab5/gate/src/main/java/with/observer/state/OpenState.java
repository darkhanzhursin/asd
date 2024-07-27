package with.observer.state;

import with.observer.GateController;

public class OpenState extends MyGateState {

    public OpenState(GateController gateController) {
        super(gateController);
        support = gateController.getSupport();
    }

    @Override
    public void pressButton() {
        gateController.setState(new ClosingState(gateController));
        support.firePropertyChange("closing", GateState.OPEN, GateState.CLOSING);
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
