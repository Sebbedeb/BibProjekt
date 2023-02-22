package Mappere;

import Entitet.Bøger;
import Entitet.Låner;

import java.util.ArrayList;

public class Facade
{
    public ArrayList<Låner> getLåners()
    {
        return LånerMapper.getLånerList();
    }
    public ArrayList<Bøger> getBøgerList()
    {
        return BøgerMapper.getBøgerList();
    }
}
