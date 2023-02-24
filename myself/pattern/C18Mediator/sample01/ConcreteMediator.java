package pattern.C18Mediator.sample01;

class ConcreteMediator extends Mediator {
    //实现业务方法，封装同事之间的调用
    public void operation() {
        ((Colleague) (colleagues.get(0))).method1(); //通过中介者调用同事类的方法
    }
}
