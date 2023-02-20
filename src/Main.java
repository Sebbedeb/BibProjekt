import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Du hedder: " + getString("Hvad hedder du?"));
    }

    public static String getString(String s)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println(s + " : ");
        return scanner.nextLine();
    }
}