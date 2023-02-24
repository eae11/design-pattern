package pattern.C13Proxy.sample01;

public class Client {
    public static void main(String[] args) {
        SellTickets proxy = new ProxyFactory().createProxy();
        proxy.sell();
    }
}
