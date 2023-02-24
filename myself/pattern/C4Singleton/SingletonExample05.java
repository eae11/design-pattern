package pattern.C4Singleton;

//只有显示通过调用getInstance方法时，才会显示装载SingletonHolder类，从而实例化instance
public class SingletonExample05 {

    private SingletonExample05() {

    }

    public static SingletonExample05 getInstance() {
        return InnerClass.instance;
    }

    private static class InnerClass {
        private static SingletonExample05 instance = new SingletonExample05();
    }

}
