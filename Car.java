
public class Car extends Main {
   private String make;
   private String model;
   private int year;
   private double milesPerGallon;
   private double milesDriven;
   private double fuelCapacity;
   private double fuelRemaining;
   //constructor
    public Car(String carMake, String carModel, int carYear, double carMilesPerGallon,double carMilesDriven ,double carFuelCapacity, double carFuelRemaining){
        this.make = carMake;
        this.model = carModel;
        this.year = carYear;
        this.milesPerGallon = carMilesPerGallon;
        this.milesDriven = carMilesDriven;
        this.fuelCapacity = carFuelCapacity;
        this.fuelRemaining = carFuelRemaining;
    }

    public void fillTank(double g){
        fuelRemaining = fuelRemaining+g;
        if(fuelRemaining > fuelCapacity){
            fuelRemaining = fuelCapacity;
            System.out.println("Gas tank is at capacity current amount in tank is: "+ fuelRemaining);
        }
    }

    public void drive(double m){
         double fuelUsed = m / milesPerGallon;
        if (fuelUsed > fuelRemaining) {
            milesDriven += (fuelUsed - fuelRemaining) * milesPerGallon;
            fuelRemaining =0;
        } else {
            milesDriven += m;
            fuelRemaining -= fuelUsed;
        }
    }

    public String toString() {
        return "Car Make:"+make + "\nCar model:" + model + "\nCar year:" + year + "\nMPG:" + milesPerGallon + "\nMiles Driven:" + milesDriven + "\nFuel Capacity:" + fuelCapacity +"" + "\nFuel Remaining:" + fuelRemaining;
    }
    public double getFuelRemaining() {
        return fuelRemaining;
    }

}
