package pattern.C10Decorator.sample02;

public class Client {
    public static void main(String[] args) {
        Document doc; //使用抽象构件类型定义
        doc = new PurchaseRequest();
        Approver newDoc; //使用具体装饰类型定义  半透明装饰模式不要用顶级基类,而是用具体的装饰,不会失去子类特有的方法
        newDoc = new Approver(doc);
        newDoc.display();//调用原有业务方法
        newDoc.approve();//调用新增业务方法

    }
}
