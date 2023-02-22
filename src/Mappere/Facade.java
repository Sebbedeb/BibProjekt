package Mappere;

import Entitet.Bøger;
import Entitet.Låner;
import Entitet.Postnr;
import Entitet.Udlån;

import java.util.ArrayList;

public class Facade
{
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
}
