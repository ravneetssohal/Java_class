package Assignments;

public class CharArray {
    public static void main(String[] args) {
        char[] array = {'A','B','C','D'};

        System.out.print("Char Array = {");
        for (char element : array){
            System.out.print(element + ",");
        }
        System.out.print("}");
    }
}