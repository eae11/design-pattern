package pattern.C15Command.sample02;
//帮助命令类：具体命令类
public class HelpCommand extends Command {
    private HelpHandler helpHandler;

    public HelpCommand() {
        this.helpHandler = new HelpHandler();
    }

    @Override
    public void execute() {
        helpHandler.display();
    }
}
