package pattern.C8Bridge.sample01;

public class Client {
    public static void main(String[] args) {
        Pen pen = new BigPen();
        Color color = new Red();
        pen.setColor(color);
        pen.draw();
    }
}
