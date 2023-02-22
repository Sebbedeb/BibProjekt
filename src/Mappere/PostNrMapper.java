package Mappere;

import Database.ConnectionConfiguration;
import Entitet.Postnr;

import java.sql.*;
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

    protected Postnr opretPostnr(Postnr postnr) throws SQLException
    {


        try {
            Connection connection = ConnectionConfiguration.getConnection();

            String sql = "INSERT  INTO bibliotekonsdag.postnr (postnr, bynavn) VALUES (?,?)";

//            PreparedStatement statement = connection.prepareStatement("INSERT  INTO manBib.Bruger (navn, adresse, postnr)" + "VALUES (?,?,?)");
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            statement.setInt(1, postnr.getPostnr());
            statement.setString(2, postnr.getBynavn());


            statement.executeUpdate();
            ResultSet resultSet = statement.getGeneratedKeys();

            resultSet.next();

        } catch (Exception e) {

            e.printStackTrace();

        }

        return postnr;


    }
}