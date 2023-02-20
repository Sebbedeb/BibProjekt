import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Du hedder: " + getString("Hvad hedder du?"));

        System.out.println("Din skostørrelse er : " + getInt("angiv venligst din skostørrelse"));

        System.out.println("Så siger vi tak");
    }

    public static String getString(String s) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(s + " : ");
        return scanner.nextLine();
    }

    public static int getInt(String s) {
        int res = 0;

        while (true) {
            try {
                res = Integer.parseInt(getString(s));
                return res;
            } catch (NumberFormatException e) {
                System.out.println("Skriv venligst kun tal");
            }
        }
    }
}