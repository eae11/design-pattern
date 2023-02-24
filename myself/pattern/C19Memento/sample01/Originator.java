package pattern.C19Memento.sample01;

public class Originator {
    private String state;

    public Originator() {

    }

    // 创建一个备忘录对象
    public Memento createMemento() {
        return new Memento(this);
    }

    // 根据备忘录对象恢复原发器状态
    public void restoreMemento(Memento m) {
        this.state = m.state;
    }

    public String getState() {
        return this.state;
    }
}
