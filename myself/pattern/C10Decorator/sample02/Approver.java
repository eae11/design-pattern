package pattern.C10Decorator.sample02;

public class Approver extends Decorator {
    public Approver(Document document) {
        super(document);
        System.out.println("增加审批功能！");
    }

    public void approve() {
        System.out.println("审批文件！");
    }

}
