 
package carrentalsystem;

public class CarRentalSystem
{
    public static void main(String[] args)
    {
        //Create two vehciles and set there Manufcaturer, Model and Year
        Vehicle Trueno = new Vehicle();
        Trueno.SetManufacturer("Toyota");
        Trueno.SetModel("AE86");
        Trueno.SetMakeYear(1986);
        
        Vehicle Fairlady = new Vehicle();
        Fairlady.SetManufacturer("Nissan");
        Fairlady.SetModel("S30Z");
        Fairlady.SetMakeYear(1969);
        
        //Print both to show there initial information
        Trueno.PrintVehicle();
        Fairlady.PrintVehicle();
        
        //Give the Trueno some journeys
        Trueno.Journey(new Journey(48));
        Trueno.Journey(new Journey(68));
        
        //Give the trueno some fuel purchases
        Trueno.FuelPurchase(new FuelPurchase(17.54, 20.00));
        Trueno.FuelPurchase(new FuelPurchase(11.40, 16.45));
        
        //Service the trueno
        Trueno.Service(new Service("05/11/1996"));
        
        //Give the trueno another journey and show its new info
        Trueno.Journey(new Journey(23));
        Trueno.PrintVehicle();
        
        //Give the fairlady a journey and fuel purchase
        Fairlady.Journey(new Journey(78));
        Fairlady.FuelPurchase(new FuelPurchase(34.67, 37.95));
        
        //Rent the fairlady per km
        Fairlady.KmRental(new PerKmRental(47));
        
        //Show the fairladys info
        Fairlady.PrintVehicle();
        
        //Attempt to rent fairlady when needing service
        Fairlady.DayRental(new PerDayRental(1, 37));
        
        //Show the fairladys info hasnt changed
        Fairlady.PrintVehicle();
        
        //Service the fairlady then attempt the rental again
        Fairlady.Service(new Service("24/02/1997"));
        Fairlady.DayRental(new PerDayRental(1, 37));
        
        //Show the fairladys new info
        Fairlady.PrintVehicle();
        
    }
    
}
