package pattern.C9Composite.sample01;

import java.util.ArrayList;
import java.util.List;

//容器里可以有容器自己或者叶子  (文件夹里可以有文件或者文件夹)
public class Composite extends Component {
    private List<Component> list = new ArrayList<>();

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return list.get(i);
    }

    @Override
    public void operation() {
        //容器构件具体业务方法的实现
        //递归调用成员构件的业务方法
        for (Component component : list) {
            component.operation();
        }
    }
}
