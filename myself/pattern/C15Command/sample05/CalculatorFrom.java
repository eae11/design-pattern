package pattern.C15Command.sample05;

//调用者
public class CalculatorFrom {
    private AbstractCommand command;

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    //调用命令对象的execute()方法执行运算
    public void compute(int value) {
        int i = command.execute(value);
        System.out.println("执行运算，运算结果为：" + i);
    }

    //调用命令对象的undo()方法执行撤销
    public void undo() {
        int i = command.undo();
        System.out.println("执行撤销，运算结果为：" + i);
    }
    //调用命令对象的redo()方法执行恢复
    public void redo() {
        int i = command.redo();
        System.out.println("执行恢复，运算结果为：" + i);
    }

}
