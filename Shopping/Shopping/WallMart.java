/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPattern.Shopping;

import java.util.Scanner;

/**
 *
 * @author rlal
 */
public class WallMart implements GroceryStore {
    private double total;
    
    public WallMart()
    {
        total = 0.0;
    }
    public void buyItems()
    {
        Scanner sc = new Scanner(System.in);
        boolean moreItem = true;
        int itemNumber = 1;
        while (moreItem)
        {
            System.out.print("Enter the name of item number "+
                    itemNumber +": ");
            String item = sc.next();
            System.out.print("Enter the price of "+item+":");
            double price = sc.nextDouble();
            total += price;
            System.out.print("Is there any more item? Enter Y/N:");
            if (sc.next().charAt(0)=='N')
            {
                moreItem  = false;
            }
            
        }
        
    }
    
    public double getTotal()
    {
        return total;
    }
    
}
