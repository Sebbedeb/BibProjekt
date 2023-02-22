import Entitet.Bøger;
import Entitet.Låner;
import Entitet.Postnr;
import Mappere.BøgerMapper;
import Mappere.Facade;
import Mappere.LånerMapper;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Facade facade = new Facade();
        ArrayList<Låner> lånerList = facade.getLåners();
        ArrayList<Bøger> bøgerList = facade.getBøgerList();
        ArrayList<Postnr> postNrList = facade.getPostNrList();
        for(Bøger bøger : bøgerList)
        {
            System.out.println(bøger);
        }
        for (Låner låner : lånerList) {

            System.out.println(låner.toString());
        }
        for (Postnr postnr : postNrList) {

            System.out.println(postnr.toString());
        }
    }
}