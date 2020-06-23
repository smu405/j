import java.awt.*;

public class Block3 {
    private Rectangle[] rectangles;

    public Block3(Point p) {
        create(p);
    }

    public Block3(int x, int y) {
        create(new Point(x, y));
    }

    public void translate(int x, int y) {
//        for (Rectangle r : rectangles) {
//            r.translate(x, y);
//        }
        for (int i = 0; i < 4; i++) {
            rectangles[i].translate(x, y);
        }
    }

    public String toString() {
        String s = "";
        for (Rectangle r : rectangles) {
            s += (r.toString() + "\n");
        }
        return s;
    }

    private void create(Point p) {
        rectangles = new Rectangle[4];
        rectangles[0] = new Rectangle(p);
        rectangles[1] = new Rectangle(new Point((int) p.getX(), (int) p.getY() + Rectangle.HEIGHT));
        rectangles[2] = new Rectangle(new Point((int) p.getX() + Rectangle.WIDTH, (int) p.getY() + Rectangle.HEIGHT));
        rectangles[3] = new Rectangle(new Point((int) p.getX() + Rectangle.WIDTH * 2, (int) p.getY() + Rectangle.HEIGHT * 3));
    }
}
