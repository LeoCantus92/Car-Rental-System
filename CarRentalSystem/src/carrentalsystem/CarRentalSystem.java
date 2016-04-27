 
package carrentalsystem;

public class CarRentalSystem
{
    public static void main(String[] args)
    {
        Vehicle Car = new Vehicle();
        Car.SetManufacturer("Toyota");
        Car.SetModel("AE86");
        Car.SetMakeYear(2015);
        Car.PrintVehicle();
        
        Journey RoadTrip = new Journey (250);
        Car.Journey(RoadTrip);
        Car.UpdateServices();
        Car.PrintVehicle();
        
        FuelPurchase Fuel = new FuelPurchase (23.00, 27.89);
        Car.FuelPurchase(Fuel);
        Car.UpdateAll();
        Car.PrintVehicle();
    }
    
}
