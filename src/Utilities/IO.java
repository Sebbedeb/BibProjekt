package Utilities;

import Entitet.Låner;
import Languages.Dialog;
import Mappere.Facade;

import java.util.Scanner;

public class IO {
    Scanner scanner = new Scanner(System.in);
    LanguageHandler lHandler = new LanguageHandler();
    Facade facade = new Facade();

    public void flow()
    {
        int i;
        String s;
        Låner låner;
        Dialog dialog;
        dialog = lHandler.vælgSprog();
        displayMessage(dialog.hello());
        displayMessage(dialog.welcome());
        i = dialogueInt(dialog.askName());
        låner = facade.findLåner(i);
        i = dialogueInt(dialog.askOptions());

    }

    public Låner findALåner(int i)
    {
        return facade.findLåner(i);
    }

    /*public void borrowABook()
    {
        facade.findBøger();
    }

     */

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


    public String displayMessage(String s)
    {
        System.out.println("**************");
        System.out.println(s);
        return s;
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
