package pattern.C15Command.sample04;

public class Client {
    public static void main(String[] args) {
        CalculatorFrom form = new CalculatorFrom();
        AbstractCommand command = new AddCommand();
        form.setCommand(command); //向发送者注入命令对象
        form.compute(10);
        form.compute(5);
        form.compute(10);
        form.undo();
    }
}
/*
需要注意的是在本实例中只能实现一步撤销操作，因为没有保存命令对象的历史状态，
可以通过引入一个命令集合或其他方式来存储每一次操作时命令的状态，从而实现多次
撤销操作。除了Undo操作外，还可以采用类似的方式实现恢复(Redo)操作，即恢复所撤
销的操作（或称为二次撤销)
 */
