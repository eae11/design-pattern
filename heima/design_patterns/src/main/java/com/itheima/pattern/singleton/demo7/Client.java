package com.itheima.pattern.singleton.demo7;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description:
 *      测试使用序列化破坏单例模式
 *
 *      桌面路径： C:\Users\Think\Desktop
 * @Author: 黑马程序员
 */
public class Client {
    public static void main(String[] args) throws Exception {
        writeObject2File();
        Singleton singleton1 = readObjectFromFile();
        Singleton singleton2 =readObjectFromFile();
        System.out.println(singleton1==singleton2);
    }

    //从文件读取数据（对象）
    public static Singleton readObjectFromFile() throws Exception {
        //1,创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("G:\\IdeaProject2\\DesignPattern\\heima\\design_patterns\\src\\main\\java\\com\\itheima\\pattern\\singleton\\demo8\\a.txt"));
        //2,读取对象
        Singleton instance = (Singleton) ois.readObject();


        //释放资源
        ois.close();
        return instance;
    }

    //向文件中写数据（对象）
    public static void writeObject2File() throws Exception {
        //1,获取Singleton对象
        Singleton instance = Singleton.getInstance();
        //2,创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("G:\\IdeaProject2\\DesignPattern\\heima\\design_patterns\\src\\main\\java\\com\\itheima\\pattern\\singleton\\demo8\\a.txt"));
        //3,写对象
        oos.writeObject(instance);
        //4,释放资源
        oos.close();
    }
}
