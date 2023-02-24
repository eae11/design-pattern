package pattern.C8Bridge.sample01;

public class BigPen extends Pen {
    @Override
    public void draw() {
        color.setColor();
        System.out.println("大号字体");
    }
}
