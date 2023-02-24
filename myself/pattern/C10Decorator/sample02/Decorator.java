package pattern.C10Decorator.sample02;

//抽象装饰类
class Decorator implements Document {
    private Document document;

    public Decorator(Document document) {
        this.document = document;
    }

    public void display() {
        document.display();
    }
}