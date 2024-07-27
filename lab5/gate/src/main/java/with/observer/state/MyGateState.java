package with.observer.state;

import with.observer.GateController;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public abstract class MyGateState {

    protected GateController gateController;
    protected PropertyChangeSupport support;

    public MyGateState(GateController gateController) {
        this.gateController = gateController;
    }

    protected enum GateState {
        OPEN,
        CLOSED,
        OPENING,
        CLOSING;
    }

    public abstract void pressButton();
    public abstract void sensorOpenSignal();
    public abstract void sensorCloseSignal();

}
