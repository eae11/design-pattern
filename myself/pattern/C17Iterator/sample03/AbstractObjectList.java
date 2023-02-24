package pattern.C17Iterator.sample03;

import java.util.ArrayList;
import java.util.List;

//抽象聚合类
public abstract class AbstractObjectList {
    private List<Object> objects = new ArrayList<>();

    public <T> AbstractObjectList(List<Object> objects) {
        this.objects = objects;
    }

    public void addObject(Object o) {
        objects.add(o);
    }

    public void removeObject(Object o) {
        objects.remove(o);
    }

    public List getObjects() {
        return objects;
    }

    public abstract AbstractIterator createIterator();
}
