/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hra;

/**
 *
 * @author kajanek6
 */
public interface IPrikazy {
    void getPrikazy();
    boolean spracujPrikaz(Prikaz prikaz);
    String[] getPlatnePrikazy();
}
