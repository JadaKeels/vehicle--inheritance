package com.pluralsight;

public class Car extends Vehicle {

    public Car(String color, int topSpeed, int fuelCapacity, int numberOfPassengers, int cargoCapacity, int numberOfDoors) {
        super(color, topSpeed, fuelCapacity, numberOfPassengers, cargoCapacity);
        this.numberOfDoors = numberOfDoors;
    }

    // Only a car has this, so it lives here and not in Vehicle
    private int numberOfDoors;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    // Actions only a car has
    public void openTrunk() {
        System.out.println("Trunk opened.");
    }

    public void closeTrunk() {
        System.out.println("Trunk closed.");
    }
}