package pattern.C10Decorator.sample01;


public class Client {
    public static void main(String[] args) {
        Component window = new Window();
        /*BlackBorderDecorator c2 = new BlackBorderDecorator(window);
        Component scrollBarDecorator = new ScrollBarDecorator(c2);*/
        Component scrollBarDecorator = new ScrollBarDecorator(window);
        scrollBarDecorator.display();

    }
}
