package pattern.C17Iterator.sample03;

import java.util.List;

//商品数据类：具体聚合类
public class ProductList extends AbstractObjectList {
    public ProductList(List<Object> objects) {
        super(objects);
    }

    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator();
    }

    //内部类实现
    private class ProductIterator implements AbstractIterator {
        private int cursor1;
        private int cursor2;

        public ProductIterator() {
            this.cursor1 = 0;
            this.cursor2 = getObjects().size() - 1;
        }

        @Override
        public void next() {
            if (cursor1 < getObjects().size()) {
                cursor1++;
            }
        }

        @Override
        public boolean isLast() {
            return cursor1 == getObjects().size();
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
            return getObjects().get(cursor1);
        }

        @Override
        public Object getPreviousItem() {
            return getObjects().get(cursor2);
        }
    }

}
