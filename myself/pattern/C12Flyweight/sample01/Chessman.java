package pattern.C12Flyweight.sample01;

//围棋棋子类：抽象享元类
abstract class Chessman {
    public abstract String getColor();

    public void display() {
        System.out.println("棋子颜色：" + this.getColor());
    }
}