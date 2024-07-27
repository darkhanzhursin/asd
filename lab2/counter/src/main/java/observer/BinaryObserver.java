package observer;

import counter.BinaryFrame;

public class BinaryObserver implements Observer {
    BinaryFrame binaryFrame;

    @Override
    public void update(int counter) {
        binaryFrame.setCount(counter);
    }

    public void setBinaryFrame(BinaryFrame binaryFrame) { this.binaryFrame = binaryFrame; }
}
