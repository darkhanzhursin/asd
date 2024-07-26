package observer;

import counter.RectFrame;

public class RectObserver implements Observer {

    private RectFrame rectFrame;

    @Override
    public void update(int counter) {
        rectFrame.setCount(counter);
    }

    public void setRectFrame(RectFrame rectFrame) {
        this.rectFrame = rectFrame;
    }
}
