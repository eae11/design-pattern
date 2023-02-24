package pattern.C4Singleton;

//懒汉模式，双重同步锁单例模式，使用volatile修饰单例属性防止指令重排，线程安全，单例实例在第一次使用时进行创建。
public class SingletonExample03 {
    private volatile static SingletonExample03 instance = null;

    private SingletonExample03() {

    }

    public static SingletonExample03 getInstance() {
        if (instance == null) {
            synchronized (SingletonExample03.class) {
                if (instance == null) {
                    return new SingletonExample03();
                }
            }
        }
        return instance;
    }
}
