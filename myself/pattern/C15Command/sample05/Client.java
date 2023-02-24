package pattern.C15Command.sample05;

public class Client {
    public static void main(String[] args) {
        CalculatorFrom form = new CalculatorFrom();
        AbstractCommand command = new AddCommand();
        form.setCommand(command); //向发送者注入命令对象
        form.compute(5);
        form.compute(10);
        form.undo();
        form.redo();
        form.undo();
        form.redo();
        form.undo();
        form.redo();

    }
}
/*
用栈来实现多次撤销和恢复
 */
