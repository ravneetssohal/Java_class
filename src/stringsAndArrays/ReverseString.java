package stringsAndArrays;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Pragra";
        int length = name.length();
        char[] name1 = new char[length];
        char[] reversedName = new char[length];
        int j = length - 1;
        for (int i = 0; i < length; i++) {
            name1[i] = name.charAt(j);
            j--;
        }

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name1[i]);
        }


    }
}
