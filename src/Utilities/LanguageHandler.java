package Utilities;

import Languages.Dansk;
import Languages.Dialog;
import Languages.English;

import java.util.Scanner;

public class LanguageHandler {
    Scanner scanner = new Scanner(System.in);
    Dialog dialog;


    public void skiftSprog() {
        if (Input.getString(dialog.changeLanguage()).equalsIgnoreCase("y")) {
            if (dialog instanceof Dansk) {
                dialog = new English();
            } else if (dialog instanceof English) {
                dialog = new Dansk();
            }
        }
    }

    public Dialog vælgSprog() {
        String sprog;
        System.out.println("Vælg venligst sprog");
        System.out.println("Please choose a language");
        System.out.println("1: Dansk\n2: English");
        sprog = scanner.next();
        Dialog dialog;
        dialog = new Dansk();
        switch (sprog) {
            case "1":
                return dialog = new Dansk();
            case "2":
                return dialog = new English();
        }
        return dialog;
    }
}