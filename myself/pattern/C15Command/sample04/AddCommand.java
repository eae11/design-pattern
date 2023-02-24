package pattern.C15Command.sample04;

public class AddCommand extends AbstractCommand {
    private Adder adder=new Adder();
    private int value;//用来撤销的

    //实现抽象命令类中声明的execute()方法，调用加法类的加法操作
    @Override
    public int execute(int value) {
        this.value = value;
        return adder.add(value);
    }

    @Override
    public int undo() {
        return adder.add(-value);
    }
}
