package pattern.C7Adapter.sample01;
//类适配器
//定义适配器类（SD兼容TF）
public class SDAdapterTF extends TFCardImpl implements SDCard {

    @Override
    public String readSD() {
        return this.readTF();
    }

    @Override
    public void writeSD(String msg) {
        this.readTF();
    }
}
