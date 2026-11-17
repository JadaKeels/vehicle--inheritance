package com.pluralsight;

public class Moped extends Vehicle {
    // Only a moped has this, so it lives here and not in Vehicle
    private int maxWeight;

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