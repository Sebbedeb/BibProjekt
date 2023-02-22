package Mappere;

import Database.ConnectionConfiguration;
import Entitet.Låner;

import java.sql.*;
import java.util.ArrayList;

public class LånerMapper
{


    protected static ArrayList<Låner> getLånerList()
    {

        ArrayList<Låner> lånerList = new ArrayList<>();

        try
        {
            Connection connection = ConnectionConfiguration.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM bibliotekonsdag.låner");

            ResultSet result = statement.executeQuery();

            while (result.next())
            {
                int id = result.getInt("idLåner");
                String navn = result.getString("navn");
                String adresse = result.getString("adresse");
                int postnr = result.getInt("postnr");

                Låner låner = new Låner(id, navn, adresse, postnr);
                lånerList.add(låner);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return lånerList;
    }
    protected Låner opretLåner(Låner låner) throws SQLException
    {


        try {
            Connection connection = ConnectionConfiguration.getConnection();

            String sql = "INSERT  INTO bibliotekonsdag.Låner (navn, adresse, postnr) VALUES (?,?,?)";

//            PreparedStatement statement = connection.prepareStatement("INSERT  INTO manBib.Bruger (navn, adresse, postnr)" + "VALUES (?,?,?)");
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            statement.setString(1, låner.getNavn());
            statement.setString(2, låner.getAdresse());
            statement.setInt(3, låner.getPostnr());


            statement.executeUpdate();
            ResultSet resultSet = statement.getGeneratedKeys();

            resultSet.next();


            låner.setIdLåner(resultSet.getInt(1));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return låner;
    }

    protected void findLåner(String s)
    {
        try {
            Connection connection = ConnectionConfiguration.getConnection();
            String sql = "SELECT * FROM bibliotekonsdag.låner WHERE navn LIKE ?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, s);

            statement.executeQuery();

        } catch(SQLException e)
        {
            e.printStackTrace();
        }
    }

}
