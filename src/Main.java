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
                int id = result.getInt("idLåner");
                String navn = result.getString("navn");
                String adresse = result.getString("adresse");
                int postnr = result.getInt("postnr");

                Låner låner = new Låner(id, navn, adresse, postnr);
                lånerList.add(låner);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Låner låner : lånerList) {
            System.out.println(låner.toString());
        }
    }
}