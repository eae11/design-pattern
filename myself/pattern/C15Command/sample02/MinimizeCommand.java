package pattern.C15Command.sample02;

//最小化命令类：具体命令类
public class MinimizeCommand extends Command {
    private WindowHanlder windowHanlder;

    public MinimizeCommand() {
        this.windowHanlder = new WindowHanlder();
    }

    @Override
    public void execute() {
        windowHanlder.minimize();
    }
}
