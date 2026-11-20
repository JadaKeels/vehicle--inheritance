package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Moped slowRide = new Moped(
                "Red",
                30,
                5,
                1,
                0,
                2
        );

        SemiTruck semiTruck = new SemiTruck(
                "Black",
                70,
                300,
                2,
                5000,
                2
        );

        Hovercraft hovercraft = new Hovercraft(
                "Blue",
                200,
                80,
                2,
                100
        );

        Car car = new Car(
                "Silver",
                200,
                300,
                4,
                500,
                4
        );

        slowRide.ride();
        semiTruck.loadCargo();
        hovercraft.hover();
        car.openTrunk();

        System.out.println("Color of the Moped: " + slowRide.getColor());
        System.out.println("Fuel capacity of the SemiTruck: " + semiTruck.getFuelCapacity());
        System.out.println("Air cushion pressure of the Hovercraft: " + hovercraft.getAirCushionPressure());
        System.out.println("Top speed of the Car: " + car.getTopSpeed());

        System.out.println(slowRide);
    }
}