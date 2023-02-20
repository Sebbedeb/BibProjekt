import Entitet.Låner;
import Mappere.LånerMapper;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {

        ArrayList<Låner> lånerList = LånerMapper.getLånerList();

        for (Låner låner : lånerList) {

            System.out.println(låner.toString());

        }

    }
}