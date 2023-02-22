package Utilities;

import java.util.Scanner;

public class IO {
    Scanner scanner = new Scanner(System.in);



    public String dialogue(String s)
    {
        displayMessage(s);
        return readUserInput();
    }

    public void displayMessage(String s)
    {
        System.out.println("**************");
        System.out.println(s);
        System.out.println("**************");
    }
    public String readUserInput()
    {
        String input = scanner.nextLine();
        return input;
    }
}
