package pattern.C6Builder.sample01;

public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        Product result = builder.getResult();
        System.out.println(result);
    }
}
