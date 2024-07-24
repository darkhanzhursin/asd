package command;


import paint.Shape;

import java.awt.*;

public class DrawCommand implements Command {
    Stack stack;
    private Shape shape;
    private Graphics g;

    public DrawCommand(Shape shape, Graphics g, Stack stack) {
        this.shape = shape;
        this.g = g;
        this.stack = stack;
    }

    @Override
    public void execute() {
        shape.draw(g);
        stack.push(shape);
    }

    @Override
    public void unExecute() {
        g.clearRect(shape.getX(),shape.getY(),shape.getWidth(),shape.getHeight());
        stack.pop();
    }

}
