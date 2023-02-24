package pattern.C4Singleton;

//懒汉模式，使用synchronized锁模式，线程安全，比较消耗性能，第一次使用时进行创建
public class SingletonExample02 {
    private static SingletonExample02 instance = null;

    private SingletonExample02() {

    }

    public static SingletonExample02 getInstance() {
        synchronized (SingletonExample02.class) {
            if (instance == null) {
                return new SingletonExample02();
            }
            return instance;
        }
    }
}
