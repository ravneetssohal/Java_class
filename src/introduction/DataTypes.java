package introduction;

public class DataTypes {
    public static void main(String[] args){
        int x = 10;
        int y = 3;
        boolean isRaining = true;
        float Salary = 2000.20f;
        System.out.println(x);
        System.out.println(Salary);

        //Modulus
        int mod = x % y;
        System.out.println(mod);

        x = x--;
        System.out.println(x);
        x += 20; // x = x + 20;


    }
}

/* Primitive Data Types: Int, boolean, float, short, double, long
Non-Primitive Data Types: String, Array

Naming conventions:
Class --> First Letter should be Uppercase
Camelcasing --> TestClass, testVariable

Variable names --> first letter should be small, remaining should follow camelcasing, testMethod


 */