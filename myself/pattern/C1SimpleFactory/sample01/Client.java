package pattern.C1SimpleFactory.sample01;

public class Client {
    public static void main(String[] args) {
        Product a = Factory.createProduct("A");
        a.methodDiff();
        a.methodSame();
    }
}
