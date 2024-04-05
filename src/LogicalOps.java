public class LogicalOps {
    public static void main(String[] args){
        int num1 = 20;
        int num2 = 10;
        int num3 = 25;
        int num4 = 20;

        System.out.println(num1 > num2 && num1 < num2);
        System.out.println(num1 >= num2 && num1 < num2);
        System.out.println(num1 > num2 && num1 <= num3);
        System.out.println(num1 != num2 && num1 < num2);
        System.out.println(num1 > num2 && num1 < num2);
        System.out.println(num1 > num4 || num1 < num2);
        System.out.println(num1 <= num4 || num1 >= num4);
        System.out.println(num1 > num4 || num2 < num2);


        /*
        && --> AND Operator, condition && condition
        || --> OR Operator, condition || condition
        ! --> NOT Operator
         */
    }
}
