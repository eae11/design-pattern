package pattern.C10Decorator.sample02;

public class Deleter extends Approver {
    public Deleter(Document document) {
        super(document);
        System.out.println("增加删除功能！");
    }

    public void delete() {
        System.out.println("删除文件");
    }
}
