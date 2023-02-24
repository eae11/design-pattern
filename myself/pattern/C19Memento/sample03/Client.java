package pattern.C19Memento.sample03;

public class Client {
    private static int index = -1; //定义一个索引来记录当前状态所在位置
    private static MementoCaretaker mc = new MementoCaretaker();

    public static void main(String[] args) {
        Chessman chess = new Chessman("车", 1, 1);
        play(chess);
        chess.setY(4);
        play(chess);
        chess.setX(5);
        play(chess);
        undo(chess, index);
        undo(chess, index);
        redo(chess, index);
        redo(chess, index);
    }


    //下棋
    public static void play(Chessman chessman) {
        mc.setChessmanMemento(chessman.save()); //保存备忘录
        index++;
        System.out.println("棋子" + chessman.getLabel() + "当前位置为：" + "第" + chessman.getX() + "行" + "第" + chessman.getY() + "列");
    }

    //悔棋
    public static void undo(Chessman chessman, int i) {
        System.out.println("******悔棋******");
        index--;
        chessman.restore(mc.getChessmanMemento(i-1));
        System.out.println("棋子" + chessman.getLabel() + "当前位置为：" + "第" + chessman.getX() + "行" + "第" + chessman.getY() + "列");
    }

    //撤销悔棋
    public static void redo(Chessman chessman, int i) {
        System.out.println("******撤销悔棋******");
        index++;
        chessman.restore(mc.getChessmanMemento(i+1));
        System.out.println("棋子" + chessman.getLabel() + "当前位置为：" + "第" + chessman.getX() + "行" + "第" + chessman.getY() + "列");
    }
}
