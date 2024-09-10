package com.vehicle.test;

import com.vehicle.Car;
import com.vehicle.ElectricCar;

public class VehicleTest {
    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.setSpeed(120);
        myCar.setFuelLevel(100);
        myCar.drive(5000);
        System.out.println("Car speed in mph: " + myCar.getSpeedMph());
        System.out.println("Car distance in km: " + myCar.getDistanceKm());
        System.out.println("Remaining fuel: " + myCar.calculateRemainingFuel(5));


        ElectricCar myElectricCar = new ElectricCar();
        myElectricCar.setSpeed(100);
        myElectricCar.setFuelLevel(80);
        myElectricCar.setBatteryLevel(90);
        myElectricCar.drive(10000);
        System.out.println("ElectricCar speed in mph: " + myElectricCar.getSpeedMph());
        System.out.println("ElectricCar distance in km: " + myElectricCar.getDistanceKm());
        System.out.println("Remaining fuel: " + myElectricCar.calculateRemainingFuel(10));
        System.out.println("Remaining battery: " + myElectricCar.getBatteryLevel());
    }
}
