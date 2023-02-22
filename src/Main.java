import Entitet.Bøger;
import Entitet.Låner;
import Entitet.Postnr;
import Entitet.Udlån;
import Mappere.Facade;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Facade facade = new Facade();
        ArrayList<Låner> lånerList = facade.getLånerList();
        ArrayList<Bøger> bøgerList = facade.getBøgerList();
        ArrayList<Postnr> postNrList = facade.getPostNrList();
        ArrayList<Udlån> udlånsList = facade.getUdlånList();

        for(Bøger bøger : bøgerList)
        {
            System.out.println(bøger.toString());
        }

        for (Låner låner : lånerList) {

            System.out.println(låner.toString());
        }
        for (Postnr postnr : postNrList) {

            System.out.println(postnr.toString());
        }
        for(Udlån udlån : udlånsList)
        {
            System.out.println(udlån.toString());
        }


    }
}