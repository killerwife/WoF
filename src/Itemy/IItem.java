package Itemy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kajanek6
 */
public interface IItem {
    String getNazov();
    String getPopis();
    int getCena();
    ItemType getTyp();
}
