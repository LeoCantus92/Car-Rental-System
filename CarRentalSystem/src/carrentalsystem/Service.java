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
public class Service {
    //Declare values
    private String Date;
    private int KmWhenServiced;
    
    //Constructor
    Service(String date)
    {
        Date = date;
        KmWhenServiced = 0;
    }
    
    //Setter for KmWhenServiced
    void SetKmWhenServiced(int KM)
    {
        KmWhenServiced = KM;
    }
    
    //Getter for KmWhenServiced
    int GetKmWhenServiced()
    {
        return KmWhenServiced;
    }
    
    //Getter for Date
    String GetServiceDate()
    {
        return Date;
    }
    
    //Print method
    void PrintService()
    {
        System.out.print(Date + ", ");
    }
}
