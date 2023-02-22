package Mappere;

import Database.ConnectionConfiguration;
import Entitet.Låner;
import Entitet.Udlån;

import java.sql.*;
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
    protected Udlån opretUdlån(Udlån udlån) throws SQLException
    {


        try {
            Connection connection = ConnectionConfiguration.getConnection();

            String sql = "INSERT  INTO bibliotekonsdag.Bruger (idUdlån, idBøger , idLåner) VALUES (?,?,?)";

//            PreparedStatement statement = connection.prepareStatement("INSERT  INTO manBib.Bruger (navn, adresse, postnr)" + "VALUES (?,?,?)");
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            statement.setInt(1, udlån.getIdUdlån());
            statement.setInt(2, udlån.getIdBøger());
            statement.setInt(3, udlån.getIdLåner());


            statement.executeUpdate();
            ResultSet resultSet = statement.getGeneratedKeys();

            resultSet.next();


            udlån.setIdLåner(resultSet.getInt(1));



        } catch (Exception e) {

            e.printStackTrace();

        }

        return udlån;


    }
}
