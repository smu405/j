/*
    @author: wiki
    @version:v20150929
    javac -d classes/ -sourcepath src/ src/headfirst/decorator/windows/*.java
    java -cp classes/ headfirst.decorator.windows.DecoratedWindowTest 
*/
package headfirst.decorator.windows;
public class DecoratedWindowTest {
    public static void main(String[] args) {
        //Create a decorated Window with horizontal and vertical scrollbars
        Window decoratedWindow = new HorizontalScrollBarDecorator (
                new VerticalScrollBarDecorator (new SimpleWindow()));

        //Print the Window's description
        System.out.println(decoratedWindow.getDescription());
    }
}

