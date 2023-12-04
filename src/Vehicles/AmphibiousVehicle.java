package Vehicles;

import interfaceVehicle.LandVehicle;
import interfaceVehicle.WaterVehicle;

public class AmphibiousVehicle implements LandVehicle, WaterVehicle {
    @Override
    public void drive() {
        System.out.println("Driving on land right now");
    }

    @Override
    public void sail() {
        System.out.println("Sailing on water");
    }
}
