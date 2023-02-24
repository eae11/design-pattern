package pattern.C1SimpleFactory.sample01;

public class Factory {
    public static Product createProduct(String producatName) {
        if (producatName.equals("A")) {
            return new pattern.C1SimpleFactory.sample01.ProductA();
        } else if (producatName.equals("B")) {
            return new pattern.C1SimpleFactory.sample01.ProductB();
        }
        return null;
    }
}
