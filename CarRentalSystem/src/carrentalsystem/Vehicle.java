/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalsystem;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author 041600494
 */
public class Vehicle
{
    private String Manufacturer;
    private String Model;
    private int MakeYear;
    private int kmTravelled;
    private int Services;
    private double TotalFuelPurchased;
    private double TotalFuelCost;
    private double AverageFuelCost;
    private double FuelEconomy;
    
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
    }
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
    }
    void SetManufacturer(String ManuFac)
    {
        Manufacturer = ManuFac;
    }
    void SetModel(String CarModel)
    {
        Model = CarModel;
    }
    void SetMakeYear(int Year)
    {
        MakeYear = Year;
    }
    void SetkmTravelled (int KM)
    {
        kmTravelled = KM;
    }
    void SetServices (int CarServices)
    {
        Services = CarServices;
    }
    void SetTotalFuelPurchased (double FuelPurchase)
    {
        TotalFuelPurchased = FuelPurchase;
    }
    void SetTotalFuelCost (double FuelCost)
    {
        TotalFuelCost = FuelCost;
    }
    void UpdateAverageFuelCost ()
    {
        AverageFuelCost = TotalFuelCost/TotalFuelPurchased;
    }
    void UpdateFuelEconomy()
    {
        FuelEconomy = kmTravelled/TotalFuelPurchased;
    }
    void UpdateServices ()
    {
        Services = (int) Math.floor(kmTravelled/100);
    }
    void UpdateAll()
    {
        AverageFuelCost = TotalFuelCost/TotalFuelPurchased;
        FuelEconomy = kmTravelled/TotalFuelPurchased;
        Services = (int) Math.floor(kmTravelled/100);
    }
    void Journey(Journey Rush)
    {
        kmTravelled = kmTravelled + Rush.GetJourneyDistance();
    }
    
    void FuelPurchase(FuelPurchase Purchase)
    {
        TotalFuelPurchased = TotalFuelPurchased + Purchase.GetFuelPurchased();
        TotalFuelCost = TotalFuelCost + Purchase.GetFuelCost();
    }

    
        public void PrintVehicle()
    {
        DecimalFormat TwoPlaces = new DecimalFormat("#.##");
        TwoPlaces.setRoundingMode(RoundingMode.CEILING);
        
        System.out.println("Manufacturer: " + Manufacturer);
        System.out.println("Model: " + Model);
        System.out.println("Year: " + MakeYear);
        System.out.println("KM Travelled: " + kmTravelled);
        System.out.println("Services: " + Services);
        System.out.println("Total Fuel Cost: $" + TotalFuelCost);
        System.out.println("Total Fuel Purchased: " + TwoPlaces.format(TotalFuelPurchased) + " Litres");
        System.out.println("Average Fuel Cost: $" + TwoPlaces.format(AverageFuelCost) + " Per Litre");
        System.out.println("Fuel Economy: " + TwoPlaces.format(FuelEconomy) + "KM Per Litre");
    }
}
