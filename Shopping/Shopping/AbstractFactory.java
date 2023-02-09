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
public abstract class AbstractFactory {
    public abstract GroceryStore createGrocetyStore(String name);
    public abstract MedicineStore createMedicineStore(String name);
}
