package Utilities;

import Languages.Dialog;

import java.util.Scanner;

public class IO {
    Scanner scanner = new Scanner(System.in);
    LanguageHandler lHandler = new LanguageHandler();

    public void Velkomst()
    {
        int i;
        Dialog dialog;
        dialog = lHandler.vælgSprog();
        displayMessage(dialog.hello());
        displayMessage(dialog.welcome());
        System.out.println(i = dialogueInt(dialog.askOptions()));
    }

    public int chooseNumbers(int i)
    {
        return 0;

    }

    public int dialogueInt(String s)
    {
        displayMessage(s);
        return readUserInputInt();
    }
    public String dialogueString(String s)
    {
        displayMessage(s);
        return readUserInputString();
    }


    public void displayMessage(String s)
    {
        System.out.println("**************");
        System.out.println(s);
    }

    public int readUserInputInt()
    {
        int input = scanner.nextInt();
        return input;
    }

    public String readUserInputString()
    {
        String input = scanner.nextLine();
        return input;
    }
}
