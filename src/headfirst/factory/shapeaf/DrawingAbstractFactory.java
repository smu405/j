package headfirst.factory.shapeaf;

public abstract class DrawingAbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
