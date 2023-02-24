package pattern.C17Iterator.sample03;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        List products = new ArrayList<>();
        products.add("倚天剑");
        products.add("屠龙刀");
        products.add("断肠草");
        products.add("葵花宝典");
        products.add("四十二章经");
        //Iterator iterator1 = products.iterator();
        //iterator1.hasNext();
        //iterator1.next();
        //iterator1.remove();
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

        System.out.println("------------------");
        LinkedList<Object> objects = new LinkedList<>();
        objects.add("倚天剑");
        objects.add("屠龙刀");
        objects.add("断肠草");
        objects.add("葵花宝典");
        objects.add("四十二章经");
        //既然有了iterator()方法，为什么还要提供一个listIterator()方法呢？因为Iterator中定义的方法太少了
        //ListIterator可以前后遍历,
        ListIterator<Object> iterator2 = (ListIterator<Object>) objects.iterator();
        iterator2.hasNext();
        System.out.println(iterator2.next());
        iterator2.hasPrevious();
        System.out.println(iterator2.previous());
    }
}
