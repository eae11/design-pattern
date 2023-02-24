package pattern.C2FactoryMethod.sample01;


import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

class Client {
    public static void main(String args[]) throws ParserConfigurationException, IOException, ClassNotFoundException, SAXException {
        LoggerFactory factory;
        Logger logger;
        //factory = new FileLoggerFactory(); //可引入配置文件实现
        factory = (LoggerFactory) XMLUtil.getBean();
        logger = factory.createLogger();
        logger.writeLog();
    }
}
