package com.builder;

public class Car {

    private String engine;
    private int doors;
    private int seats;
    private String parkingSensor;
    private String fogLights;
    private String battery;

    public Car(String engine, int doors, int seats, String parkingSensor, String fogLights, String battery) {
        this.engine = engine;
        this.doors = doors;
        this.seats = seats;
        this.parkingSensor = parkingSensor;
        this.fogLights = fogLights;
        this.battery = battery;
    }

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    public static class CarBuilder {
        private String engine;
        private int doors;
        private int seats;
        private String parkingSensor;
        private String fogLights;
        private String battery;

        CarBuilder() {
        }

        public CarBuilder engine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder doors(int doors) {
            this.doors = doors;
            return this;
        }

        public CarBuilder seats(int seats) {
            this.seats = seats;
            return this;
        }

        public CarBuilder parkingSensor(String parkingSensor) {
            this.parkingSensor = parkingSensor;
            return this;
        }

        public CarBuilder fogLights(String fogLights) {
            this.fogLights = fogLights;
            return this;
        }

        public CarBuilder battery(String battery) {
            this.battery = battery;
            return this;
        }

        public Car build() {
            return new Car(engine, doors, seats, parkingSensor, fogLights, battery);
        }

        public String toString() {
            return "Car.CarBuilder(engine=" + this.engine + ", doors=" + this.doors + ", seats=" + this.seats + ", parkingSensor=" + this.parkingSensor + ", fogLights=" + this.fogLights + ", battery=" + this.battery + ")";
        }
    }
}
