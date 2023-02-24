package pattern.C9Composite.sample01;

public class Client {
    public static void main(String[] args) {
        //文件夹1
        Component folder1 = new Composite();
        //文件夹2
        Component folder2 = new Composite();
        //文件1,2,3
        Component file1 = new Leaf("文件1");
        Component file2 = new Leaf("文件2");
        Component file3 = new Leaf("文件3");

        folder2.add(file2);
        folder2.add(file3);

        folder1.add(file1);
        folder1.add(folder2);

        folder1.operation();

    }
}
