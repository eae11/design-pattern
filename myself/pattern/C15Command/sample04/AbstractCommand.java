package pattern.C15Command.sample04;

//抽象命令类
abstract class AbstractCommand {
    public abstract int execute(int value); //声明命令执行方法execute()

    public abstract int undo(); //声明撤销方法undo()
}