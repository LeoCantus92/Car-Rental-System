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
    private int kmDistance;
    
    Journey(int KM)
    {
        kmDistance = KM;
    }
    
    void SetJourneyDistance (int KM)
    {
        kmDistance = KM;
    }
    
    int GetJourneyDistance()
    {
        return kmDistance;
    }
}
