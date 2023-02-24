package pattern.C7Adapter.sample02;

public class Client {
    public static void main(String[] args) {
        TFCardImpl tfCard = new TFCardImpl();
        SDAdapterTF sdAdapterTF = new SDAdapterTF();
        sdAdapterTF.setTfCard(tfCard);
        Computer computer = new Computer();
        String s = computer.readSD(sdAdapterTF);
        System.out.println(s);
    }
}
