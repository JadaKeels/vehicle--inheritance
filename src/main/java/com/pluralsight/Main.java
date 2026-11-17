package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Moped slowRide = new Moped("Red", 1, 0, 5);
        slowRide.setColor("Red");           // inherited from Vehicle
        slowRide.setFuelCapacity(5);        // inherited from Vehicle

        SemiTruck semiTruck = new SemiTruck( "Black", 70, 300 2,2);
        semiTruck.setNumberOfTrailers(2);   // SemiTruck's own setter
        semiTruck.setFuelCapacity(100);     // inherited from Vehicle

        Hovercraft hovercraft = new Hovercraft("Blue", 200, 80, 2);
        hovercraft.setAirCushionPressure(50);   // Hovercraft's own setter
        hovercraft.setColor("Blue");            // inherited from Vehicle

        Car car = new Car("Silver", 200, 300, 4);
        car.setNumberOfDoors(4);            // Car's own setter
        car.setTopSpeed(200);               // inherited from Vehicle

        // Test the functionality of the classes and methods
        slowRide.ride();
        semiTruck.loadCargo();
        hovercraft.hover();
        car.openTrunk();

        // Accessing Vehicle getters
        System.out.println("Color of the Moped: " + slowRide.getColor());
        System.out.println("Fuel capacity of the SemiTruck: " + semiTruck.getFuelCapacity());
        System.out.println("Air cushion pressure of the Hovercraft: " + hovercraft.getAirCushionPressure());
        System.out.println("Top speed of the Car: " + car.getTopSpeed());

        // Printing an object calls its toString() method automatically.
        System.out.println(slowRide);
    }
}