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
public class Journey
{
    //Declare value
    private int kmDistance;
    
    //Constructor
    Journey(int KM)
    {
        kmDistance = KM;
    }
    
    //Getter for kmDistance
    int GetJourneyDistance()
    {
        return kmDistance;
    }
    
    //Print method
    void PrintJourney()
    {
        System.out.print(kmDistance+"km, ");
    }
}
