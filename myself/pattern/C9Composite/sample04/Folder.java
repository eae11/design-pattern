package pattern.C9Composite.sample04;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile {
    private List<AbstractFile> list = new ArrayList<>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    public void add(AbstractFile file) {
        list.add(file);

    }

    public void remove(AbstractFile file) {
        list.remove(file);
    }

    public AbstractFile getChild(int i) {
        return list.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("****对文件夹'" + name + "'进行杀毒"); //模拟杀毒

        for (AbstractFile abstractFile : list) {
            abstractFile.killVirus();
        }
    }
}
