import Vehicles.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start();
        Car honda = new Car();
        honda.start();
        honda.drive();

        AmphibiousVehicle waterCar = new AmphibiousVehicle();
        waterCar.drive();
        waterCar.sail();

        }

}