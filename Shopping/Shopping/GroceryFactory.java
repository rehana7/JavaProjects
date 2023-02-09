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
public class GroceryFactory extends AbstractFactory {
    
    public GroceryStore createGrocetyStore(String name)
    {
        if (name.equals("WallMart"))
            return new WallMart();
        else if (name.equals("HyVee"))
            return new HyVee();
        else
            return null;
    
    }
    
    public MedicineStore createMedicineStore(String name)
    {
        return null;
    }
    
}
