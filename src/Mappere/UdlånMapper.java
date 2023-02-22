package Mappere;

import Database.ConnectionConfiguration;
import Entitet.Udlån;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UdlånMapper {

    protected static ArrayList<Udlån> getUdlånList()
    {

        ArrayList<Udlån> udlånList = new ArrayList<>();

        try
        {
            Connection connection = ConnectionConfiguration.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM bibliotekonsdag.udlån");

            ResultSet result = statement.executeQuery();

            while (result.next())
            {
                int idUdlån = result.getInt("idUdlån");
                int idBøger = result.getInt("idBøger");
                int idLåner = result.getInt("idLåner");

                Udlån udlån = new Udlån(idUdlån, idBøger, idLåner);
                udlånList.add(udlån);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return udlånList;
    }
}
