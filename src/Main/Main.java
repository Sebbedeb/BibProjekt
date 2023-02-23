package Main;

import Languages.Dialog;
import Mappere.Facade;
import Utilities.IO;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Facade facade = new Facade();
        IO io = new IO();
        Dialog dialog;

        io.Velkomst();



    }

    //io.dialogue("Skriv venligst dit navn");










/*
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
 */
}