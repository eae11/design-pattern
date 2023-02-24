package pattern.C19Memento.sample02;

public class Client {
    public static void main(String[] args) {
        MementoCaretaker mc = new MementoCaretaker();
        Chessman chessman = new Chessman("车", 1, 1);
        display(chessman);
        mc.setChessmanMemento(chessman.save());//保存状态
        chessman.setY(4);
        display(chessman);
        mc.setChessmanMemento(chessman.save()); //保存状态
        display(chessman);
        chessman.setX(5);
        display(chessman);
        System.out.println("******悔棋******");
        chessman.restore(mc.getChessmanMemento()); //恢复状态
        display(chessman);


    }

    public static void display(Chessman chessman) {
        System.out.println("棋子" + chessman.getLabel() + "当前位置为：" + "第" + chessman.getX() + "行" + "第" + chessman.getY() + "列");
    }
}
