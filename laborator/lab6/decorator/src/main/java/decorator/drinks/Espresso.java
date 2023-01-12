package decorator.drinks;

import decorator.Beverage;

public class Espresso implements Beverage {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public Double getCost() {
        return 8.0;
    }
}
