package pattern.C2FactoryMethod.sample02;

abstract class LoggerFactory {
    public abstract Logger createLogger();

    public abstract Logger createLogger(String args);

    public abstract Logger createLogger(Object obj);

    public void writeLog() {
        Logger logger = this.createLogger();
        logger.writeLog();
    }
}
