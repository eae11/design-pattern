package pattern.C9Composite.sample03;

//抽象文件类：抽象构件
abstract class AbstractFile {
    public void add(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }

    public void remove(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }

    public AbstractFile getChild(int i) {
        System.out.println("对不起，不支持该方法！");
        return null;
    }

    public abstract void killVirus();
}
