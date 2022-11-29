package com.builder;

public class CarrrBuilder {

    private String engine;
    private int doors;
    private int seats;
    private String parkingSensor;
    private String fogLights;
    private String battery;

    public CarrrBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarrrBuilder setDoors(int doors) {
        this.doors = doors;
        return this;
    }

    public CarrrBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    public CarrrBuilder setParkingSensor(String parkingSensor) {
        this.parkingSensor = parkingSensor;
        return this;
    }

    public CarrrBuilder setFogLights(String fogLights) {
        this.fogLights = fogLights;
        return this;
    }

    public CarrrBuilder setBattery(String battery) {
        this.battery = battery;
        return this;
    }

    public Car build() {
        return new Car(engine, doors, seats, parkingSensor, fogLights, battery);
    }

}
