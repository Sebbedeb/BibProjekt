package Mappere;

import Database.ConnectionConfiguration;
import Entitet.Bøger;
import Entitet.Låner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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


}
