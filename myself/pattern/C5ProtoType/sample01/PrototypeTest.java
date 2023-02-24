package pattern.C5ProtoType.sample01;

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype r1 = new Realizetype();
        Realizetype r2 = r1.clone();//浅拷贝

        System.out.println("对象r1和r2是同一个对象？" + (r1 == r2));
    }
}