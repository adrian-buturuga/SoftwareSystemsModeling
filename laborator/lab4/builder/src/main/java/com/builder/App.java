package com.builder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //instead of this
        Car car = new Car("SimpleEngine", 4, 4, null, null, null);

        //do this
        Director director = new Director();

        Car sportCar = director.createSportCar();
    }
}
