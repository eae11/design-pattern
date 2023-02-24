package pattern.C8Bridge.sample01;

public abstract class Pen {
    protected Color color;

    public abstract void draw();

    public void setColor(Color color) {
        this.color = color;
    }
}
