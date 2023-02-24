package pattern.C12Flyweight.sample01;

import java.util.Hashtable;

public class ChessmanFactory {
    private static ChessmanFactory instance = new ChessmanFactory();
    private static Hashtable ht; //使用Hashtable来存储享元对象，充当享元池

    private ChessmanFactory() {
        ht = new Hashtable();
        Chessman black, white;
        black = new BlackChessman();
        ht.put("b", black);
        white = new WhiteChessman();
        ht.put("w", white);
    }

    public static ChessmanFactory getInstance() {
        return instance;
    }


    public static Chessman getChessman(String color) {
        return (Chessman) ht.get(color);
    }
}
