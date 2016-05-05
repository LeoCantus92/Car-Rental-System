/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalsystem;

/**
 *
 * @author leoca
 */
public class PerKmRental {
    //Declare values
    private int kmTravelled;
    private double Cost;
    private double DollarsPerKm;
    
    //Constructor
    PerKmRental(int KM)
    {
        kmTravelled = KM;
        DollarsPerKm = 1;
        Cost = KM*DollarsPerKm;
    }
    
    //Getter for kmTravelled
    int GetKM()
    {
        return kmTravelled;
    }
    
    //Getter for Cost
    double GetCost()
    {
        return Cost;
    }
    
    //Print method
    void PrintKmRental()
    {
        System.out.print(kmTravelled+" Km for $"+Cost+", ");
    }
}
