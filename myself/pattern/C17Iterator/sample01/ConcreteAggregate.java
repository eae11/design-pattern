package pattern.C17Iterator.sample01;

public class ConcreteAggregate implements Aggregate {
    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(this);
    }
}
