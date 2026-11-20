package com.pluralsight;

public class Hovercraft extends Vehicle {

    private int airCushionPressure;

    public Hovercraft(String color,
                      int topSpeed,
                      int fuelCapacity,
                      int numberOfPassengers,
                      int airCushionPressure) {

        super(color,
                topSpeed,
                fuelCapacity,
                numberOfPassengers,
                0); // cargoCapacity

        this.airCushionPressure = airCushionPressure;
    }

    public int getAirCushionPressure() {
        return airCushionPressure;
    }

    public void setAirCushionPressure(int airCushionPressure) {
        this.airCushionPressure = airCushionPressure;
    }

    public void hover() {
        System.out.println("Hovercraft is hovering.");
    }

    @Override
    public String toString() {
        return "Hovercraft{" +
                "color='" + getColor() + '\'' +
                ", topSpeed=" + getTopSpeed() +
                ", fuelCapacity=" + getFuelCapacity() +
                ", airCushionPressure=" + airCushionPressure +
                '}';
    }
}