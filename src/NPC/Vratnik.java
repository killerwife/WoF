/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NPC;

import Hra.Prikaz;

/**
 *
 * @author kajanek6
 */
public class Vratnik implements IPokecatelny{
    
    @Override
    public void spracujPrikaz(Prikaz prikaz) {
        String nazovPrikazu = prikaz.getNazov();
        switch(nazovPrikazu) {
            case "vypisKluce":
                break;
            case "dajKluc":
                break;
            case "odid":
                break;
        }
    }

    @Override
    public void getPrikazy() {
        System.out.println("Mozes pouzit tieto prikazy:");
        System.out.println("vypisKluce dajKluc odid");
    }

    @Override
    public String getNazov() {
        return "Vratnik";
    }
    
}
