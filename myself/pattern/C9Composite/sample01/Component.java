package pattern.C9Composite.sample01;

public abstract class Component {
    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract Component getChild(int i);

    public abstract void operation(); //业务方法


}
