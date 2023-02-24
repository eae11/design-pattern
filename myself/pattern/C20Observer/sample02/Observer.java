package pattern.C20Observer.sample02;

//抽象观察类
//此案例中观察者是盟友
interface Observer {
    public String getName();

    public void setName(String name);

    public void help(); //声明支援盟友方法

    public void beAttacked(AllyControlCenter acc); //声明遭受攻击方法
}
