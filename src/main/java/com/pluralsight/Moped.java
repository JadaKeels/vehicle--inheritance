package com.pluralsight;

public class Moped extends Vehicle {

    public Moped(String color, int topSpeed, int fuelCapacity, int numberOfPassengers, int cargoCapacity, int maxWeight) {
        super(color, topSpeed, fuelCapacity, numberOfPassengers, cargoCapacity);
    }
}

    // Only a moped has this, so it lives here and not in Vehicle
    private int maxWeight;

        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    // An action only a moped has
    public void ride() {
        System.out.println("Riding the moped.");
    }

    // Every class in Java inherits a toString() from the Object class
    @Override
    public String toString() {
        return "Moped{" +
                "maxWeight=" + maxWeight +
                ", model='" + getModel() + '\'' +
                ", color='" + getColor() + '\'' +
                ", topSpeed=" + getTopSpeed() +
                ", fuelCapacity=" + getFuelCapacity() +
                ", numberOfPassengers=" + getNumberOfPassengers() +
                ", cargoCapacity=" + getCargoCapacity() +
                '}';
    }
}