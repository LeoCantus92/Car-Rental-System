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
    private double FuelPurchased;
    private double FuelCost;
    
    FuelPurchase(double Purchased, double Cost)
    {
        FuelPurchased = Purchased;
        FuelCost = Cost;
    }
    
    void SetFuelPurchased (double Purchased)
    {
        FuelPurchased = Purchased;
    }
    
    double GetFuelPurchased ()
    {
        return FuelPurchased;
    }
    
    void SetFuelCost(double Cost)
    {
        FuelCost = Cost;
    }
    
    double GetFuelCost ()
    {
        return FuelCost;
    }
}
