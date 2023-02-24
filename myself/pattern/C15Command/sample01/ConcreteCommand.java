package pattern.C15Command.sample01;

public class ConcreteCommand extends Command {
    private Receiver receiver;

    @Override
    public void execute() {
        receiver.action();//调用请求接收者的业务处理方法action()
    }
}
