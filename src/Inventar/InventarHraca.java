/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventar;

import Itemy.EquippableItem;
import Itemy.IItem;
import Itemy.ItemType;

/**
 *
 * @author kajanek6
 */
public class InventarHraca extends Inventar {
    private EquippableItem [] sloty;

    public InventarHraca() {
        this.sloty = new EquippableItem[SlotyInventara.MAX_SLOTOV.getValue()];
    }
    
    @Override
    public void vypisInventar() {
        for (EquippableItem item : this.sloty) {
            if (item != null) {
                System.out.println(item.getSlot().getPopis() + ": " + item.getNazov());
            }
        }
        super.vypisInventar();
    }
    
    public void nasadItem(String nazov) {
        IItem item = dajItem(nazov);
        if (item == null) {
            System.out.println("Nepodarilo sa najst item.");
            return;
        }
        
        if (item instanceof EquippableItem) {
            EquippableItem equipItem = (EquippableItem)item;
            int slotId = equipItem.getSlot().getValue();
            EquippableItem momentalnyItem = sloty[slotId];
            if (momentalnyItem != null) {
                this.zoberItemDoInventara(momentalnyItem);
            }
            sloty[slotId] = equipItem;
            this.odoberItemZInventara(equipItem);
            System.out.println("Item " + equipItem.getNazov() + " bol uspesne nasadeny.");
        } else {
            System.out.println("Tento item sa neda nasadit.");
            return;
        }
    }

    public boolean maEquipnute(ItemType typ) {
        for (EquippableItem item : sloty) {
            if (item != null && item.getTyp() == typ)
                return true;
        }
        return false;
    }    
}
