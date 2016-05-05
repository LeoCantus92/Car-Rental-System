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
public class PerDayRental {
    //Declare values
    private int DaysRented;
    private int kmTravelled;
    private double Cost;
    private double DollarsPerDay;
    
    //Constructor
    PerDayRental(int Days, int KM)
    {
        DaysRented = Days;
        kmTravelled = KM;
        DollarsPerDay = 100;
        Cost = Days*DollarsPerDay;
    }
    
    //Getter for DaysRented
    int GetDays()
    {
        return DaysRented;
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
    void PrintDayRental()
    {
        System.out.print(DaysRented+" days for $"+Cost+", ");
    }
}
