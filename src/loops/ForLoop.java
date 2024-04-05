package loops;

public class ForLoop {
    public static void main(String[] args) {

        for(int counter = 1; counter <= 10; counter++){
            System.out.println(counter);
        }

        for(int counter = 1; counter <= 10; counter++){

            if(counter % 2 == 0 && counter < 6){
                break;
            }
            System.out.println(counter);
        }

        for(int counter = 1; counter <= 10; counter++){

            if(counter % 2 == 0){
                continue;
            }
            System.out.println(counter);
        }

        /*
        for(initialization; condition; increment/decrement){
        statement
        }
         */
    }
}
