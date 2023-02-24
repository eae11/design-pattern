package pattern.C3AbstractFactory.sample01;

//抽象工厂模式跟工厂方法模式主要区别在于生成产品的个数
interface SkinFactory {
    public Button createButton();

    public TextField createTextField();

    public ComboBox createComboBox();
}
