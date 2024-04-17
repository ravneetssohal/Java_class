package stringsAndArrays;

public class BufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Test");
        System.out.println(sb);

        String s1 = "Mouse";
        s1.concat(" keyboard");
        System.out.println(s1);
        System.out.println(s1.concat(" keyboard"));
        String s2 = s1.concat(" Keyboard");
        System.out.println(s2);


        sb.append("eeeest");
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("Test");
        System.out.println(sb1.reverse());

    }
}
