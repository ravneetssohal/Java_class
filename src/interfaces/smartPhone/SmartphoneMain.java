package interfaces.smartPhone;

public class SmartphoneMain {
    public static void main(String[] args) {
        SmartPhone iphone = new Iphone();
        System.out.println(iphone.add(1, 3));

        iphone.makeCall();
    }
}
