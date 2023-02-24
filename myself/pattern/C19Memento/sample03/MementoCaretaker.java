package pattern.C19Memento.sample03;

import java.util.ArrayList;
import java.util.List;

//多个备忘录多次撤销
public class MementoCaretaker {
    private List<ChessmanMemento> mementoList = new ArrayList<>();

    public ChessmanMemento getChessmanMemento(int i) {
        return mementoList.get(i);
    }

    public void setChessmanMemento(ChessmanMemento chessmanMemento) {
        mementoList.add(chessmanMemento);
    }
}
