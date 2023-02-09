/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPattern.Shopping;

/**
 *
 * @author rlal
 */
public class MedicineFactory extends AbstractFactory {
    
    public GroceryStore createGrocetyStore(String name)
    {
        return null;
    
    }
    
    public MedicineStore createMedicineStore(String name)
    {
       if (name=="WallGreen")
            return new WallGreen();
        else if (name == "Mosaic")
            return new Mosaic();
        else
            return null;
    }
    
}
