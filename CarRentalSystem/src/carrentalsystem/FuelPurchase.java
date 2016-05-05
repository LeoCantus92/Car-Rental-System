/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalsystem;

/**
 *
 * @author 041600494
 */
public class FuelPurchase
{
    //Declare values
    private double FuelPurchased;
    private double FuelCost;
    
    //Constructor
    FuelPurchase(double Purchased, double Cost)
    {
        FuelPurchased = Purchased;
        FuelCost = Cost;
    }
    
    //Getter for FuelPurchased
    double GetFuelPurchased ()
    {
        return FuelPurchased;
    }
    
    //Getter for FuelCost
    double GetFuelCost ()
    {
        return FuelCost;
    }
    
    //Print method
    void PrintFuelPurchase()
    {
        System.out.print(FuelPurchased + " Litres for $"+FuelCost+", ");
    }
}
