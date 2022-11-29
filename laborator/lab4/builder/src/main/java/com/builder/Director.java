package com.builder;

public class Director {

    public Car createSportCar() {
        return Car.builder()
                .doors(2)
                .seats(2)
                .build();
    }

    public Car createSimpleCar() {
        return Car.builder()
                .doors(4)
                .seats(4)
                .build();
    }
}
