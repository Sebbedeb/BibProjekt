package Utilities;

import Languages.Dialog;

import java.util.Scanner;

public class IO {
    Scanner scanner = new Scanner(System.in);
    LanguageHandler lHandler = new LanguageHandler();

    public void Velkomst()
    {
        Dialog dialog;
        dialog = lHandler.vælgSprog();
        dialog.hello();
        dialog.welcome();
        dialog.askAge();
    }



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
