package pattern.C5ProtoType.sample03;

import java.io.*;
//深拷贝,两个对象不一样
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Student stu = new Student("张三", "西安");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("G:\\IdeaProject2\\DesignPattern\\myself\\pattern\\C5ProtoType\\sample03\\a.txt"));
        oos.writeObject(stu);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("G:\\IdeaProject2\\DesignPattern\\myself\\pattern\\C5ProtoType\\sample03\\a.txt"));
        Student stu1 = (Student) ois.readObject();
        System.out.println(stu == stu1);

    }
}