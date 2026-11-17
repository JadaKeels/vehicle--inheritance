package com.pluralsight;

public class SemiTruck extends Vehicle {

    // Only a semi truck has this, so it lives here and not in Vehicle
    private int numberOfTrailers;

    public SemiTruck(String color, int topSpeed, int fuelCapacity,
                     int numberOfPassengers, int cargoCapacity,
                     int numberOfTrailers) {

        super(color, topSpeed, fuelCapacity, numberOfPassengers, cargoCapacity);
        this.numberOfTrailers = numberOfTrailers;
    }

    public int getNumberOfTrailers() {
        return numberOfTrailers;
    }

    public void setNumberOfTrailers(int numberOfTrailers) {
        this.numberOfTrailers = numberOfTrailers;
    }

    // Actions only a semi truck has
    public void loadCargo() {
        System.out.println("Cargo loaded onto the truck.");
    }
}