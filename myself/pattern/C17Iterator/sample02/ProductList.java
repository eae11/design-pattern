package pattern.C17Iterator.sample02;

import java.util.List;
//商品数据类：具体聚合类
public class ProductList extends AbstractObjectList {
    public ProductList(List<Object> objects) {
        super(objects);
    }

    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }

}
