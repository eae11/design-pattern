package pattern.C7Adapter.sample02;

//对象适配器
//定义适配器类（SD兼容TF）
public class SDAdapterTF implements SDCard {
    private TFCard tfCard;

    @Override
    public String readSD() {
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        tfCard.readTF();
    }

    public void setTfCard(TFCard tfCard) {
        this.tfCard = tfCard;
    }
}
