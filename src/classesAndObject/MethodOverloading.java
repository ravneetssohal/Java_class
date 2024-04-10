package classesAndObject;

public class MethodOverloading {
    //Same method name but different parameters.

    public int sum(int a , int b){
        return a + b;
    }

    public int sum(int a, int b, int c){
        return a + b + c;
    }

    public double sum(double a, double b, double c){
        return a + b + c;
    }

    public int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }

    public static void main(String[] args) {

        MethodOverloading cal = new MethodOverloading();
        int sum = cal.sum(10, 20, 230);
        System.out.println(sum);

    }
}
