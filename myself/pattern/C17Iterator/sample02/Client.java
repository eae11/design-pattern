package pattern.C17Iterator.sample02;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List products = new ArrayList<>();
        products.add("倚天剑");
        products.add("屠龙刀");
        products.add("断肠草");
        products.add("葵花宝典");
        products.add("四十二章经");
        ProductList productList = new ProductList(products);
        //for (Object product : products) {
        //    System.out.println(product);
        //}
        AbstractIterator iterator = productList.createIterator();
        //正向遍历
        while (!iterator.isLast()) {
            System.out.println(iterator.getNextItem());
            iterator.next();
        }
        System.out.println("------------------");
        //反向遍历
        while ((!iterator.isFirst())) {
            System.out.println(iterator.getPreviousItem());
            iterator.previous();
        }

    }
}
