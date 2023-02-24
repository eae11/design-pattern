package pattern.C13Proxy.sample01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private SellTickets station = new TranStation();

    public SellTickets createProxy() {
        SellTickets proxyObject = (SellTickets) Proxy.newProxyInstance(station.getClass().getClassLoader(), station.getClass().getInterfaces(), new InvocationHandler() {
            /*
                        Object proxy : 代理对象。和proxyObject对象是同一个对象，在invoke方法中基本不用
                        Method method ： 对接口中的方法进行封装的method对象
                        Object[] args ： 调用方法的实际参数

                        返回值： 方法的返回值。
                     */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object obj;
                if (method.getName().equals("sell")) {
                    System.out.println("卖票前");
                    //返回值
                    obj = method.invoke(station, args);
                    System.out.println("卖票后");
                } else {
                    obj = method.invoke(proxy, args);
                }
                return obj;
            }
        });
        return proxyObject;
    }
}
