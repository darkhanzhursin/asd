package with.observer;

import with.observer.state.MyGateState;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class GateController {

    private MyGateState state;

    public void setState(MyGateState state) {
        this.state = state;
    }

    private PropertyChangeSupport support;

    public GateController() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void pressButton(){
        state.pressButton();
    }

    public void sensorOpenSignal(){
        state.sensorOpenSignal();
    }

    public void sensorCloseSignal(){
        state.sensorCloseSignal();
    }

    public PropertyChangeSupport getSupport() {
        return support;
    }

    public void setSupport(PropertyChangeSupport support) {
        this.support = support;
    }
}
