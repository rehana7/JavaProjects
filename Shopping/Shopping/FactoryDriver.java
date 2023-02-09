 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPattern.Shopping;

import java.util.Scanner;

/**
 *
 * @author rlal
 */
public class FactoryDriver {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter what you want to buy:");
        AbstractFactory objFactory = FactoryCreator.getFactoryCreator().
                createFactory(sc.next());
        if (objFactory instanceof GroceryFactory)
        {
        	System.out.println("Enter the grocery store name from which you want to buy:");
        	GroceryStore objStore = objFactory.createGrocetyStore(sc.next());
        	objStore.buyItems();
        	System.out.println("Total price is: "+objStore.getTotal());
        }
        else if(objFactory instanceof MedicineFactory)
        {
        	System.out.println("Enter the medicine store name from which you want to buy:");
        	GroceryStore objStore = objFactory.createGrocetyStore(sc.next());
        	objStore.buyItems();
        	System.out.println("Total price is: "+objStore.getTotal());
        }
    }
    
}
