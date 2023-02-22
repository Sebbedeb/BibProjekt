import Entitet.Bøger;
import Entitet.Låner;
import Mappere.BøgerMapper;
import Mappere.LånerMapper;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {

        ArrayList<Låner> lånerList = LånerMapper.getLånerList();
        ArrayList<Bøger> bøgerList = BøgerMapper.getBøgerList();
        for(Bøger bøger : bøgerList)
        {
            System.out.println(bøger);
        }
        for (Låner låner : lånerList) {

            System.out.println(låner.toString());
        }
    }
}