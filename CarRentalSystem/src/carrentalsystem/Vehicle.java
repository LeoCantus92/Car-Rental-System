/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalsystem;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * 
 * @author 041600494
 */
public class Vehicle
{
    //Declare values
    private String Manufacturer;
    private String Model;
    private int MakeYear;
    private int kmTravelled;
    private int Services;
    private double TotalFuelPurchased;
    private double TotalFuelCost;
    private double AverageFuelCost;
    private double FuelEconomy;
    private double TotalRevenue;
    private int kmWhenServiced;
    private ArrayList<Journey> JourneyList;
    private ArrayList<Service> ServiceList;
    private ArrayList<FuelPurchase> FuelPurchaseList;
    private ArrayList<PerKmRental> KmRentalList;
    private ArrayList<PerDayRental> DayRentalList;
    
    //Constructor
    Vehicle()
    {
        Manufacturer = "No manufacturer given.";
        Model = "No model given.";
        MakeYear = 0;
        kmTravelled = 0;
        Services = 0;
        TotalFuelPurchased = 0;
        TotalFuelCost = 0.00;
        AverageFuelCost = 0;
        FuelEconomy = 0;
        TotalRevenue = 0;
        kmWhenServiced = 0;
        JourneyList = new ArrayList<Journey>();
        ServiceList = new ArrayList<Service>();
        FuelPurchaseList = new ArrayList<FuelPurchase>();
        KmRentalList = new ArrayList<PerKmRental>();
        DayRentalList = new ArrayList<PerDayRental>();
    }
    
    //Copy Constructor
    Vehicle(Vehicle Original)
    {
        Manufacturer = Original.Manufacturer;
        Model = Original.Model;
        MakeYear = Original.MakeYear;
        kmTravelled = Original.kmTravelled;
        Services = Original.Services;
        TotalFuelPurchased = Original.TotalFuelPurchased;
        TotalFuelCost = Original.TotalFuelCost;
        AverageFuelCost = Original.AverageFuelCost;
        FuelEconomy = Original.FuelEconomy;
        TotalRevenue = Original.TotalRevenue;
        kmWhenServiced = Original.kmWhenServiced;
        JourneyList = Original.JourneyList;
        ServiceList = Original.ServiceList;
        FuelPurchaseList = Original.FuelPurchaseList;
        KmRentalList = Original.KmRentalList;
        DayRentalList = Original.DayRentalList;
    }
    
    //Setter for Manufacturer
    void SetManufacturer(String ManuFac)
    {
        Manufacturer = ManuFac;
    }
    
    //Setter for Model
    void SetModel(String CarModel)
    {
        Model = CarModel;
    }
    
    //Setter for MakeYear
    void SetMakeYear(int Year)
    {
        MakeYear = Year;
    }
    
    //Setter for kmTravelled
    void SetkmTravelled (int KM)
    {
        kmTravelled = KM;
    }
    
    //Setter for Services
    void SetServices (int CarServices)
    {
        Services = CarServices;
    }
    
    //Setter for TotalFuelPurchased
    void SetTotalFuelPurchased (double FuelPurchase)
    {
        TotalFuelPurchased = FuelPurchase;
    }
    
    //Setter for TotalFuelCost
    void SetTotalFuelCost (double FuelCost)
    {
        TotalFuelCost = FuelCost;
    }
    
    //Calculates the average fuel cost and updates it
    void UpdateAverageFuelCost ()
    {
        AverageFuelCost = TotalFuelCost/TotalFuelPurchased;
    }
    
    //Calculates the fuel economy and update it
    void UpdateFuelEconomy()
    {
        FuelEconomy = TotalFuelPurchased/(kmTravelled/100);
    }
    
    //Service the vehicle
    void Service (Service serve)
    {
        //Add the service to the vehicles list of services
        ServiceList.add(serve);
        
        //Sets the kmWhenServiced in the Vehicle and Service class
        kmWhenServiced = kmTravelled;
        serve.SetKmWhenServiced(kmWhenServiced);
        
        //Increment services
        Services += 1; 
    }
    
    //Calculate both the average fuel cost and fuel economy and update them
    void UpdateAll()
    {
        AverageFuelCost = TotalFuelCost/TotalFuelPurchased;
        FuelEconomy = TotalFuelPurchased/(kmTravelled/100);
    }
    
    //Add a journey to the vehicle
    void Journey(Journey Rush)
    {
        //Add the journey to the vehicles list of vehicles
        JourneyList.add(Rush);
        
        //Add the journeys km to the vehicles total km travelled
        kmTravelled += Rush.GetJourneyDistance();
    }
    
    //Add a FuelPurchase to the vehicle
    void FuelPurchase(FuelPurchase Purchase)
    {
        //Add the FuelPurchased to the vehicles total amount
        TotalFuelPurchased += Purchase.GetFuelPurchased();
        
        //Add the Fuel Cost to the vehicles total amount
        TotalFuelCost += Purchase.GetFuelCost();
        
        //Add the Fuel Purchase to the vehicles list of Fuel Purchases
        FuelPurchaseList.add(Purchase);
    }
    
    void KmRental(PerKmRental Rent)
    {
        //Check if the vehicle needs to be serviced
        if ((kmTravelled - kmWhenServiced) >= 100)
        {
            //Display error message
            System.out.println("Vehicle "+Model+" must be serviced first!");
        }
        else
        {
            //Add the kilometres travelled to the vehicles total
            kmTravelled += Rent.GetKM();
            
            //Add the revenue to the vehicles total
            TotalRevenue += Rent.GetCost();
            
            //Add the Per KM Rental to the vehicls list of Per KM Rentals 
            KmRentalList.add(Rent);
        }
    }

    void DayRental(PerDayRental Rent)
    {
        //Check if the vehicle needs to be serviced
        if ((kmTravelled - kmWhenServiced) >= 100)
        {
            //Display error message
            System.out.println("Vehicle "+Model+"must be serviced first!");
        }
        else
        {
            //Add the kilometres travelled to the vehicles total
            kmTravelled += Rent.GetKM();
            
            //Add the revenue to the vehicles total
            TotalRevenue += Rent.GetCost();
            
            //Add the Per Day Rental to the vehicles list of Per Day Rentals
            DayRentalList.add(Rent);
        }
    }

    //Print out the details of a vehicle
    public void PrintVehicle()
    {
        //Make sure everythings updated before printing
        UpdateAll();
        
        //Create format for the doubles so they only use two decimal places
        DecimalFormat TwoPlaces = new DecimalFormat("#.##");
        TwoPlaces.setRoundingMode(RoundingMode.CEILING);
        
        //Make index for loops
        int index;
        
        //Print the vehicles values
        System.out.println("-----------------------------------------------------------");
        System.out.println("Manufacturer: " + Manufacturer);
        System.out.println("Model: " + Model);
        System.out.println("Year: " + MakeYear);
        System.out.println("KM Travelled: " + kmTravelled);
        System.out.println("Services: " + Services);
        System.out.println("Total Fuel Cost: $" + TotalFuelCost);
        System.out.println("Total Fuel Purchased: " + TwoPlaces.format(TotalFuelPurchased) + " Litres");
        System.out.println("Average Fuel Cost: $" + TwoPlaces.format(AverageFuelCost) + " Per Litre");
        System.out.println("Fuel Economy: " + TwoPlaces.format(FuelEconomy) + " Litres Per 100KM");
        System.out.println("Total Revenue: $" + TwoPlaces.format(TotalRevenue));
        System.out.println("Kilometres travelled when last serviced: " + kmWhenServiced);
        
        //For the lists start the line with the name of the object
        System.out.print("Journeys: ");
        
        //Loop through each element of the list
        for(index=0; index<JourneyList.size(); index++)
        {
            //Use the print method in the object
            JourneyList.get(index).PrintJourney();
        }
        System.out.print("\nServices: ");
        for(index=0; index<ServiceList.size(); index++)
        {
            ServiceList.get(index).PrintService();
        }
        
        System.out.print("\nFuel Purchases: ");
        for(index = 0; index<FuelPurchaseList.size(); index++)
        {
            FuelPurchaseList.get(index).PrintFuelPurchase();
        }
        
        System.out.print("\nPerKmRentals: ");
        for(index = 0; index<KmRentalList.size(); index++)
        {
            KmRentalList.get(index).PrintKmRental();
        }
        
        System.out.print("\nPerDayRentals: ");
        for (index = 0; index<DayRentalList.size(); index++)
        {
            DayRentalList.get(index).PrintDayRental();
        }
        
        System.out.println("\n-----------------------------------------------------------");
    }
}
