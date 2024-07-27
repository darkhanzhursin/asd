package observer;

import counter.TextFrame;

public class TextObserver implements Observer {

    private TextFrame textframe;

    @Override
    public void update(int counter) {
        textframe.setCount(counter);
    }

    public void setTextFrame(TextFrame textframe) {
        this.textframe = textframe;
    }
}
