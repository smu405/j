/*
    @author: tutorialspoint modified
    @version:v20151014
    javac -d classes/ -sourcepath src/ src/headfirst/factory/shapeaf/*.java
    java -cp classes/ headfirst.factory.shapeaf.DrawingTest
*/
package headfirst.factory.shapeaf;

public class DrawingTest {
    public static void main(String[] args) {
        DrawingAbstractFactory factory=new ShapeFactory();
        Shape s=factory.getShape("CIRCLE");
        s.show();
        factory=new ColorFactory();
        Color c=factory.getColor("red");
        c.fill();
    }
}

