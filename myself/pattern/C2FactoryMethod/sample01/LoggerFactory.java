package pattern.C2FactoryMethod.sample01;

//日志记录器工厂接口：抽象工厂
//与简单工厂相比,简单工厂只有一个,而工厂方法则抽象一个工厂类,有很多具体的工厂实现类,生成不同产品
interface LoggerFactory {
    public Logger createLogger();

    public Logger createLogger(String args);

    public Logger createLogger(Object obj);

}
