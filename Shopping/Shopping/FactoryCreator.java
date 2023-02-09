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
public class FactoryCreator {
    
    private static FactoryCreator objFactory = new FactoryCreator();
    
    private FactoryCreator(){}
    
    public static FactoryCreator getFactoryCreator()
    {
        /*
        if(objFactory == null)
            objFactory = new FactoryCreator();
*/
        return objFactory;   
    }
    
    public AbstractFactory createFactory(String factoryName)
    {
        if(factoryName.equals("Grocery"))
        {
            return new GroceryFactory();
        }
        else if (factoryName.equals("Medicine"))
        {
           return new MedicineFactory();
        }
        else
        {
                return null;
        }
    
    }
    
}
