package com.pluralsight;

public class Hovercraft extends Vehicle {

    public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }
}

    // Only a hovercraft has this, so it lives here and not in Vehicle
    private int airCushionPressure;

    public int getAirCushionPressure() {
        return airCushionPressure;
    }

    public void setAirCushionPressure(int airCushionPressure) {
        this.airCushionPressure = airCushionPressure;
    }

    public Hovercraft(String color, int topSpeed, int fuelCapacity, int numberOfPassengers, int cargoCapacity, int airCushionPressure) {
        super(color, topSpeed, fuelCapacity, numberOfPassengers, cargoCapacity);
        this.airCushionPressure = airCushionPressure;
    }

    // An action only a hovercraft has
    public void hover() {
        System.out.println("Hovercraft is hovering.");
    }
}