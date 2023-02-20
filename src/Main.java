import Database.ConnectionConfiguration;
import Entitet.Låner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Låner> lånerList = new ArrayList<>();

        try {
            Connection connection = ConnectionConfiguration.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM bibliotekonsdag.låner");

            ResultSet result = statement.executeQuery();

            while (result.next()) {
                int id = result.getInt("bibliotekonsdag.låner.idlåner");
                String navn = result.getString("bibliotekonsdag.låner.navn");
                String adresse = result.getString("bibliotekonsdag.låner.adresse");
                int postnr = result.getInt("bibliotekonsdag.låner.postnr");

                Låner låner = new Låner(id, navn, adresse, postnr);
                lånerList.add(låner);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("Du hedder: " + getString("Hvad hedder du?"));

        System.out.println("Din skostørrelse er : " + getInt("angiv venligst din skostørrelse"));

        while (true) {
            switch (getString("angiv dit ønske ? ")) {
                case "lån bog":
                    System.out.println("du ønsker at låne en bog");
            }
            if (getString("q for Quit").equalsIgnoreCase("q")) {
                break;
            }
        }
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