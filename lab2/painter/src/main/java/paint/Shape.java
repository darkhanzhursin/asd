package paint;

import java.awt.*;

public class Shape {
    private String type;
    private int x, y, width, height, color;

    public Shape(String type, int x, int y, int width, int height, int color) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void draw(Graphics g) {
        if (color == 1)
            g.setColor(Color.red);
        else if (color == 2)
            g.setColor(Color.green);
        else if (color == 3)
            g.setColor(Color.blue);
        else if (color == 4)
            g.setColor(Color.yellow);

        if (type.equals("Circle")) {
            g.fillOval(x, y, width, height);
        } else if (type.equals("Rectangle")) {
            g.fillRect(x, y, width, height);
        } else if (type.equals("Line")) {
            g.drawLine(x, y, width, height);
        }
    }

    public String getType() {
        return type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getColor() {
        return color;
    }
}
