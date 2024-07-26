package observer;

import counter.TextFrame;

public class TextFrameView implements Observer {

    private TextFrame textframe;

    @Override
    public void update(int counter) {
        handleCounter(counter);
    }

    void handleCounter(int counter) {

    }
}
