package pattern.C15Command.sample05;

import java.util.ArrayDeque;

public class AddCommand extends AbstractCommand {
    private Adder adder = new Adder();
    private ArrayDeque<Integer> stack1 = new ArrayDeque();//撤销用
    private ArrayDeque<Integer> stack2 = new ArrayDeque();//恢复用

    //实现抽象命令类中声明的execute()方法，调用加法类的加法操作
    @Override
    public int execute(int value) {
        stack1.push(value);
        return adder.add(value);
    }

    @Override
    public int undo() {
        if (stack1.peekFirst() != null) {
            int i = stack1.pop();
            stack2.push(i);
            return adder.add(-i);
        } else {
            throw new RuntimeException("不能再撤销了");
        }

    }

    @Override
    public int redo() {
        if (stack2.peekFirst() != null) {
            int i = stack2.pop();
            stack1.push(i);
            return adder.add(i);
        } else {
            throw new RuntimeException("不能再恢复了");
        }
    }
}
