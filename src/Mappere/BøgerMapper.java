package Mappere;

import Database.ConnectionConfiguration;
import Entitet.Bøger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.*;
import java.util.ArrayList;

public class BøgerMapper {



    protected static ArrayList<Bøger> getBøgerList()
    {

        ArrayList<Bøger> bøgerList = new ArrayList<>();

        try
        {
            Connection connection = ConnectionConfiguration.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM bibliotekonsdag.bøger");

            ResultSet result = statement.executeQuery();

            while (result.next())
            {
                int idBøger = result.getInt("idBøger");
                String titel = result.getString("titel");
                String forfatter = result.getString("forfatter");

                Bøger bøger = new Bøger(idBøger, titel, forfatter);
                bøgerList.add(bøger);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return bøgerList;
    }
    protected    Bøger opretBøger(Bøger bøger) throws SQLException
    {


        try {
            Connection connection = ConnectionConfiguration.getConnection();

            String sql = "INSERT  INTO bibliotekonsdag.Bøger (idBøger, titel, forfatter) VALUES (?,?,?)";

//            PreparedStatement statement = connection.prepareStatement("INSERT  INTO manBib.Bøger (idBøger, titel, forfatter)" + "VALUES (?,?,?)");
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            statement.setInt(1, bøger.getIdbøger());
            statement.setString(2, bøger.getTitel());
            statement.setString(3, bøger.getForfatter());


            statement.executeUpdate();
            ResultSet resultSet = statement.getGeneratedKeys();

            resultSet.next();


            bøger.setIdbøger(resultSet.getInt(1));



        } catch (Exception e) {

            e.printStackTrace();

        }

        return bøger;


    }



}
