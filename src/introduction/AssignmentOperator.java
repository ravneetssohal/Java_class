package introduction;

public class AssignmentOperator {
    public static void main(String[] args){
        System.out.println("Before Swapping");
        int x = 10;
        int y = 20;
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);

        System.out.println("After Swapping");
        int z;
        z = x;
        x = y;
        y = z;
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);



    }
}
