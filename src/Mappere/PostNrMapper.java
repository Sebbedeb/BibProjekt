package Mappere;

import Database.ConnectionConfiguration;
import Entitet.Postnr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PostNrMapper {

    protected static ArrayList<Postnr> getPostNrList() {
        ArrayList<Postnr> postNrList = new ArrayList<>();

        try {
            Connection connection = ConnectionConfiguration.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM bibliotekonsdag.postnr");

            ResultSet result = statement.executeQuery();

            while (result.next()) {
                int postnr = result.getInt("postnr");
                String bynavn = result.getString("bynavn");

                Postnr postNr = new Postnr(postnr, bynavn);
                postNrList.add(postNr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return postNrList;
    }
}