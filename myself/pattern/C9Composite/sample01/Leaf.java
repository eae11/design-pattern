package pattern.C9Composite.sample01;

//叶子没有子节点  (文件里面不能继续包含文件或文件夹)
public class Leaf extends Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    public void add(Component c) {
//异常处理或错误提示
    }

    public void remove(Component c) {
//异常处理或错误提示
    }

    public Component getChild(int i) {
//异常处理或错误提示
        return null;
    }

    public void operation() {
//叶子构件具体业务方法的实现
        System.out.println("打开"+name);
    }

}
