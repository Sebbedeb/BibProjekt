import Entitet.Låner;
import Mappere.LånerMapper;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        LånerMapper lånerMapper = new LånerMapper();
        ArrayList<Låner> lånerList = lånerMapper.getLånerList();
    }
}