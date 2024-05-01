package interfaces.smartPhone;

public class Iphone implements SmartPhone{
    double calculation;

    @Override
    public double add(double a, double b) {
        calculation = a + b;
        return calculation;
    }

    @Override
    public double sub(double a, double b) {
        calculation = a - b;
        return calculation;
    }

    @Override
    public double mul(double a, double b) {
        calculation = a * b;
        return calculation;
    }

    @Override
    public double div(double a, double b) {
        calculation = a / b;
        return calculation;
    }

    @Override
    public void capture() {
        System.out.println("Captured Photo");
    }

    @Override
    public void textEditor() {

    }

    @Override
    public void play() {
        System.out.println("Play Song");
    }

    @Override
    public void pause() {
        System.out.println("Paused Song");
    }

    @Override
    public void makeCall() {
        System.out.println("Make Call");
    }
}
