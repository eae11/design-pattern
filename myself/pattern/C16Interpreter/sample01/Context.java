package pattern.C16Interpreter.sample01;

import java.util.HashMap;

/*当系统无须提供全局公共信息时可以省略环境类，可根据实际情况决定是否需要环境类。*/
class Context {
    private HashMap map = new HashMap();

    public void assign(String key, String value) {
        //往环境类中设值
    }

    public String lookup(String key) {
//获取存储在环境类中的值
        return null;
    }
}