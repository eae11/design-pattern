package pattern.C18Mediator.sample03;

//文本标签类：具体同事类
class Label extends Component {
public void update() {
System.out.println("文本标签内容改变，客户信息总数加1。");
}
}