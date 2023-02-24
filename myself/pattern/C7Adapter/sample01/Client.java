package pattern.C7Adapter.sample01;

public class Client {
    public static void main(String[] args) {
        SDAdapterTF sdAdapterTF = new SDAdapterTF();
        Computer computer = new Computer();
        String s = computer.readSD(sdAdapterTF);
        System.out.println(s);
    }
}
