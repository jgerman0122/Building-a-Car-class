//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Honda","Civic",2022,23.5,5.0,30.0,15.0);
        Car car2 = new Car("Chevy","Camaro",2022,25.5,10.0,30.0,18.0);
        Car car3 = new Car("Toyota","Camry",2024,17.5,300.0,30.0,15.0);

        Car[] cars = {car1,car2,car3};
        for (int i=0; i< cars.length; i++){
            cars[i].drive(10);
            cars[i].fillTank(10);
            System.out.println(cars[i].getFuelRemaining());
            System.out.println(cars[i].toString());
        }
    }
}