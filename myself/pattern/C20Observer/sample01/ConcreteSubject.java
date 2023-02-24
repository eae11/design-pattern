package pattern.C20Observer.sample01;

public class ConcreteSubject extends Subject {
    @Override
    public void notice() {
        //遍历观察者集合，调用每一个观察者的响应方法
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
