package with.observer;

import with.observer.state.MyGateState;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class GateController {
//    private enum GateState {
//        OPEN,
//        CLOSED,
//        OPENING,
//        CLOSING;
//    }
//    private GateState status = GateState.CLOSED;

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

//    public void addPropertyChangeListener(PropertyChangeListener listener) {
//        state.addPropertyChangeListener(listener);
//    }

    public void pressButton(){
        state.pressButton();
    }

    public void sensorOpenSignal(){
        state.sensorOpenSignal();
//        switch (status) {
//            case OPEN: {
//                System.out.println("This is not possible");
//                break;
//            }
//            case CLOSED: {
//                System.out.println("This is not possible");
//                break;
//            }
//            case OPENING: {
//                status = GateState.OPEN;
//                support.firePropertyChange("open", GateState.OPENING, status);
//
//                break;
//            }
//            case CLOSING: {
//                System.out.println("This is not possible");
//                break;
//            }
//        }

    }

    public void sensorCloseSignal(){
        state.sensorCloseSignal();
//        switch (status) {
//            case OPEN: {
//                System.out.println("This is not possible");
//            }
//            case CLOSED: {
//                System.out.println("This is not possible");
//            }
//            case OPENING: {
//                System.out.println("This is not possible");
//            }
//            case CLOSING: {
//                status = GateState.CLOSED;
//                support.firePropertyChange("closed", GateState.CLOSING, status);
//            }
//        }
    }

    public MyGateState getState() {
        return state;
    }

    public PropertyChangeSupport getSupport() {
        return support;
    }

    public void setSupport(PropertyChangeSupport support) {
        this.support = support;
    }
}
