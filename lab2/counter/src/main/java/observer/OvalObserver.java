package observer;

import counter.OvalFrame;

public class OvalObserver implements Observer {

    private OvalFrame ovalFrame;

    @Override
    public void update(int counter) {
        ovalFrame.setCount(counter);
    }

    public void setOvalFrame(OvalFrame ovalFrame) {
        this.ovalFrame = ovalFrame;
    }
}
