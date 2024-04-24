package OOPs.encapsulation;

import java.util.Scanner;

public class TextEditorMain {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor("Data");
        System.out.println(textEditor.getText());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to edit the text? Type(Y/N)");
        String response = scanner.nextLine();

        if(response.equalsIgnoreCase("Y")){
            System.out.println("Edit the file below: ");
            String text1 = scanner.nextLine();
            textEditor.setText(text1);
        }
        
        System.out.println("Data in the file: ");
        System.out.println(textEditor.toString());

    }
}
