package pattern.C4Singleton;

//懒汉模式，线程不安全，第一次使用的时候创建。
public class SingletonExample01 {
    private static SingletonExample01 instance = null;

    private SingletonExample01() {

    }

    public static SingletonExample01 getInstance() {
        if (instance == null) {
            return new SingletonExample01();
        }
        return instance;
    }
}
