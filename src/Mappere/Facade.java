package Mappere;

import Entitet.Bøger;
import Entitet.Låner;
import Entitet.Postnr;
import Entitet.Udlån;

import java.sql.SQLException;
import java.util.ArrayList;

public class Facade
{
    LånerMapper lånerMapper = new LånerMapper();
    PostNrMapper postNrMapper = new PostNrMapper();
    public ArrayList<Låner> getLånerList()
    {
        return LånerMapper.getLånerList();
    }
    public ArrayList<Bøger> getBøgerList()
    {
        return BøgerMapper.getBøgerList();
    }
    public ArrayList<Postnr> getPostNrList()
    {
        return PostNrMapper.getPostNrList();
    }
    public ArrayList<Udlån> getUdlånList()
    {
        return UdlånMapper.getUdlånList();
    }

    public Låner opretLåner(Låner l) throws SQLException {
        return lånerMapper.opretLåner(l);
    }
    public Postnr opretPostnr(Postnr p) throws SQLException {
        return postNrMapper.opretPostnr(p);
    }

    public void findLåner (String s)
    {
        lånerMapper.findLåner(s);
    }
}
