package pattern.C4Singleton;

//饿汉模式，线程安全，(类加载的时候jvm保证线程安全)单例实例在类装载时进行创建。
public class SingletonExample04 {
    private static SingletonExample04 instance = new SingletonExample04();

    private SingletonExample04() {

    }

    public static SingletonExample04 getInstance() {
        return instance;
    }
}
