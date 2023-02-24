组合模式强调让叶子对象和容器对象的使用具有一致性

sample02透明组合模式
透明组合模式的缺点是不够安全，因为叶子对象和容器对象在本质上是有区别的。叶子对象
不可能有下一个层次的对象，即不可能包含成员对象，因此为其提供add()、remove()以及
getChild()等方法是没有意义的，这在编译阶段不会出错，但在运行阶段如果调用这些方法可
能会出错（如果没有提供相应的错误处理代码）。


通过引入组合模式，Sunny公司设计的杀毒软件具有良好的可扩展性，在增加新的文件类型
时，无须修改现有类库代码，只需增加一个新的文件类作为AbstractFile类的子类即可，但是
由于在AbstractFile中声明了大量用于管理和访问成员构件的方法，例如add()、remove()等方
法，我们不得不在新增的文件类中实现这些方法，提供对应的错误提示和异常处理。为了简
化代码，我们有以下两个解决方案：

解决方案一：将叶子构件的add()、remove()等方法的实现代码移至AbstractFile类中，由
AbstractFile提供统一的默认实现(sample03)
//提供默认实现的抽象构件类
abstract class AbstractFile {
public void add(AbstractFile file) {
System.out.println("对不起，不支持该方法！");
}
public void remove(AbstractFile file) {
System.out.println("对不起，不支持该方法！");
}
public AbstractFile getChild(int i) {
System.out.println("对不起，不支持该方法！");
return null;
}
public abstract void killVirus();
}
如果客户端代码针对抽象类AbstractFile编程，在调用文件对象的这些方法时将出现错误提
示。如果不希望出现任何错误提示，我们可以在客户端定义文件对象时不使用抽象层，而直
接使用具体叶子构件本身，客户端代码片段如下所示：
class Client {
public static void main(String args[]) {
//不能透明处理叶子构件
ImageFile file1,file2;
TextFile file3,file4;
VideoFile file5;
AbstractFile folder1,folder2,folder3,folder4;
//其他代码省略
}
}
这样就产生了一种不透明的使用方式，即在客户端不能全部针对抽象构件类编程，需要使用
具体叶子构件类型来定义叶子对象。









解决方案二：除此之外，还有一种解决方法是在抽象构件AbstractFile中不声明任何用于访问
和管理成员构件的方法，代码如下所示： (安全组合模式)sample04
abstract class AbstractFile {
public abstract void killVirus();
}

1. 适用场景
在以下情况下可以考虑使用组合模式：
(1) 在具有整体和部分的层次结构中，希望通过一种方式忽略整体与部分的差异，客户端可以
一致地对待它们。
(2) 在一个使用面向对象语言开发的系统中需要处理一个树形结构。
(3) 在一个系统中能够分离出叶子对象和容器对象，而且它们的类型不固定，需要增加一些新
的类型