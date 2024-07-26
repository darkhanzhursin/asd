package observer;

import counter.BinaryFrame;
import counter.Counter;

public class BinaryView implements Observer {
    BinaryFrame binaryFrame;

    @Override
    public void update(int counter) {
        handleCounter(counter);
    }

    void handleCounter(int counter) {
        binaryFrame.setCount(counter);
    }

    public void setBinaryFrame(BinaryFrame binaryFrame) { this.binaryFrame = binaryFrame; }
}
