import Entitet.Bøger;
import Entitet.Låner;
import Mappere.BøgerMapper;
import Mappere.Facade;
import Mappere.LånerMapper;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Facade facade = new Facade();
        facade.getLåners();
        facade.getBøgerList();
        facade.getPostNrList()
        for(Bøger bøger : bøgerList)
        {
            System.out.println(bøger);
        }
        for (Låner låner : lånerList) {

            System.out.println(låner.toString());
        }
    }
}