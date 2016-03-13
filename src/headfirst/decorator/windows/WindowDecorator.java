package headfirst.decorator.windows;

public abstract class WindowDecorator implements Window {
    protected Window windowToBeDecorated;

    public WindowDecorator (Window windowToBeDecorated) {
        this.windowToBeDecorated = windowToBeDecorated;
    }
    public void draw() {
        windowToBeDecorated.draw();
    }
    public String getDescription() {
        return windowToBeDecorated.getDescription();
    }
}

