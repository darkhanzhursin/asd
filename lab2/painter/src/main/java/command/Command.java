package command;

import paint.Shape;

public interface Command {
    void execute();
    void unExecute();
    //Shape getShape();
}
