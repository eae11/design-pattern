package pattern.C12Flyweight.sample02;

public class Client {
    public static void main(String[] args) {
        Chessman black1, black2, black3, white1, white2;
        ChessmanFactory factory;
        //获取享元工厂对象
        factory = ChessmanFactory.getInstance();
        //通过享元工厂获取三颗黑子
        black1 = factory.getChessman("b");
        black2 = factory.getChessman("b");
        black3 = factory.getChessman("b");
        System.out.println("判断两颗黑子是否相同：" + (black1 == black2));
        //通过享元工厂获取两颗白子
        white1 = factory.getChessman("w");
        white2 = factory.getChessman("w");
        System.out.println("判断两颗白子是否相同：" + (white1 == white2));
        //显示棋子
        black1.display(new Coordinates(1,2));
        black2.display(new Coordinates(3,4));
        black3.display(new Coordinates(1,3));
        white1.display(new Coordinates(2,5));
        white2.display(new Coordinates(2,4));
    }
}
