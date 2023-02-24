package pattern.C17Iterator.sample02;

import java.util.List;

//商品迭代器：具体迭代器
public class ProductIterator implements AbstractIterator {
    //private ProductList productList;
    private List products;
    private int cursor1;//定义一个游标，用于记录正向遍历的位置
    private int cursor2;//定义一个游标，用于记录逆向遍历的位置

    public ProductIterator(ProductList list) {
        //this.productList = list;
        this.products = list.getObjects();
        cursor1 = 0;
        cursor2 = products.size() - 1;
    }

    @Override
    public void next() {
        if (cursor1 < products.size()) {
            cursor1++;
        }
    }

    @Override
    public boolean isLast() {
        return cursor1 == products.size();
    }

    @Override
    public void previous() {
        if (cursor2 >= 0) {
            cursor2--;
        }
    }

    @Override
    public boolean isFirst() {
        return cursor2 == -1;
    }

    @Override
    public Object getNextItem() {
        return products.get(cursor1);
    }

    @Override
    public Object getPreviousItem() {
        return products.get(cursor2);
    }
}
