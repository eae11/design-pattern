package pattern.C18Mediator.sample03;

//增加一个界面组件类Label  修改原有的具体中介者类ConcreteMediator或者，而是增加一个ConcreteMediator的子类SubConcreteMediator来实现对
//Label对象的引用
class Client {
    public static void main(String args[]) {
//用新增具体中介者定义中介者对象
        SubConcreteMediator mediator;
        mediator = new SubConcreteMediator();
        Button addBT = new Button();
        List list = new List();
        ComboBox cb = new ComboBox();
        TextBox userNameTB = new TextBox();
        Label label = new Label();
        addBT.setMediator(mediator);
        list.setMediator(mediator);
        cb.setMediator(mediator);
        userNameTB.setMediator(mediator);
        label.setMediator(mediator);
        mediator.addButton = addBT;
        mediator.list = list;
        mediator.cb = cb;
        mediator.userNameTextBox = userNameTB;
        mediator.label = label;
        addBT.changed();
        System.out.println("-----------------------------");
        list.changed();
    }
}
