package with.observer.state;

import with.observer.GateController;

public class OpeningState extends MyGateState {

    public OpeningState(GateController gateController) {
        super(gateController);
        support = gateController.getSupport();
    }

    @Override
    public void pressButton() {
        gateController.setState(new ClosingState(gateController));
        support.firePropertyChange("closing", GateState.OPENING, GateState.CLOSING);
        gateController.setSupport(support);
    }

    @Override
    public void sensorOpenSignal() {
        gateController.setState(new OpenState(gateController));
        support.firePropertyChange("open", GateState.OPENING, GateState.OPEN);
        gateController.setSupport(support);
    }

    @Override
    public void sensorCloseSignal() {
        System.out.println("This is not possible");
    }
}
