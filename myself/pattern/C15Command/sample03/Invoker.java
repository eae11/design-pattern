package pattern.C15Command.sample03;

/*
命令队列与我们常说的“批处理”有点类似。批处理，顾名思义，可以对一组对象（命令）进行
批量处理，当一个发送者发送请求后，将有一系列接收者对请求作出响应，命令队列可以用
于设计批处理应用程序，如果请求接收者的接收次序没有严格的先后次序，我们还可以使用
多线程技术来并发调用命令对象的execute()方法，从而提高程序的执行效率。
 */
public class Invoker {
    private CommandQueue commandQueue;

    public Invoker(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    public void setCommandQueue(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    public void execute() {
        commandQueue.execute();
    }
}
