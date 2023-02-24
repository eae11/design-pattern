package pattern.C2FactoryMethod.sample01;


//数据库日志记录器工厂类：具体工厂
class DatabaseLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
        Logger logger = new DatabaseLogger();
        return logger;
    }

    public Logger createLogger(String args) {
        Logger logger = new DatabaseLogger();
        return logger;
    }

    public Logger createLogger(Object obj) {
        Logger logger = new DatabaseLogger();
        return logger;
    }
}

