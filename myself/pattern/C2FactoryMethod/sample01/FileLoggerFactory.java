package pattern.C2FactoryMethod.sample01;


//文件日志记录器工厂类：具体工厂
class FileLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
//创建文件日志记录器对象
        Logger logger = new FileLogger();
//创建文件，代码省略
        return logger;
    }

    public Logger createLogger(String args) {
        Logger logger = new FileLogger();
        return logger;
    }

    public Logger createLogger(Object obj) {
        Logger logger = new FileLogger();
        return logger;
    }
}
