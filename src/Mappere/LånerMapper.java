package Mappere;

import Database.ConnectionConfiguration;
import Entitet.Låner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
}
