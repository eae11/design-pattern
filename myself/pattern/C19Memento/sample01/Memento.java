package pattern.C19Memento.sample01;

/*
在设计备忘录类时需要考虑其封装性，除了Originator类，不允许其他类来调用备忘录类
Memento的构造函数与相关方法，如果不考虑封装性，允许其他类调用setState()等方法，将导
致在备忘录中保存的历史状态发生改变，通过撤销操作所恢复的状态就不再是真实的历史状
态，备忘录模式也就失去了本身的意义。

 */
class Memento {
    String state;

    public Memento(Originator o) {
        state = o.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
