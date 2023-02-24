package pattern.C14ChainOfResponsibility.sample01;

//董事会类：具体处理者
class Congress extends Approver {
    public Congress(String name) {
        super(name);
    }

    //具体请求处理方法
    public void processRequest(PurchaseRequest request) {
        System.out.println("召开董事会审批采购单：" + request.getNumber() + "，金额" + request.getAmount() + ",采购目的" + request.getPurpose());
    }
}