package com.pluralsight;

public class Vehicle {

    private String color;
    private int numberOfPassengers;
    private int cargoCapacity;
    private int fuelCapacity;

    //Gettors and Setters

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    //Methods
public void startEngine() {

    System.out.println("Engine started");
}

public void stopEngine() {

    System.out.println("Engine stopped");
}

public void accelerate() {

System.out.println("Vehicle accelerating");
}

public void brake() {

    System.out.println("Vehicle braking");
}
      }
