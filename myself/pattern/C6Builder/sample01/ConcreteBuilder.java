package pattern.C6Builder.sample01;

public class ConcreteBuilder extends Builder {
    @Override
    public void buildPartA() {
        product.setPartA("设置partA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("设置partB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("设置partC");
    }
}
