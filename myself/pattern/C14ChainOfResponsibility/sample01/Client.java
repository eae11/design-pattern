package pattern.C14ChainOfResponsibility.sample01;

public class Client {
    public static void main(String[] args) {
        Approver wjzhang, gyang, jguo, meeting;
        wjzhang = new Director("张无忌");//主任
        gyang = new VicePresident("杨过");//副董事长
        jguo = new President("郭靖");//董事长
        meeting = new Congress("董事会");//董事会
        //创建职责链
        wjzhang.setSuccessor(gyang);
        gyang.setSuccessor(jguo);
        jguo.setSuccessor(meeting);
        //创建采购单
        PurchaseRequest pr1 = new PurchaseRequest(45000, 10001, "购买倚天剑");
        wjzhang.processRequest(pr1);
        PurchaseRequest pr2 = new PurchaseRequest(60000, 10002, "购买《葵花宝典》");
        wjzhang.processRequest(pr2);
        PurchaseRequest pr3 = new PurchaseRequest(160000, 10003, "购买《金刚经》");
        wjzhang.processRequest(pr3);
        PurchaseRequest pr4 = new PurchaseRequest(800000, 10004, "购买桃花岛");
        wjzhang.processRequest(pr4);
    }
}
/*
如果需要在系统增加一个新的具体处理者，如增加一个经理(Manager)角色可以审批5万元至8
万元（不包括8万元）的采购单，需要编写一个新的具体处理者类Manager，作为抽象处理者
类Approver的子类，实现在Approver类中定义的抽象处理方法，如果采购金额大于等于8万
元，则将请求转发给下家，代码如下所示：
//经理类：具体处理者
class Manager extends Approver {
public Manager(String name) {
super(name);
}
//具体请求处理方法
public void processRequest(PurchaseRequest request) {
if (request.getAmount() < 80000) {
System.out.println("经理" + this.name + "审批采购单：" + request.get}
else {
this.successor.processRequest(request); //转发请求
}
}
}

 */
