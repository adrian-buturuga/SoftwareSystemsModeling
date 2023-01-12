package decorator.drinks;

import decorator.Beverage;

public class Cappuccino implements Beverage {

    @Override
    public String getDescription() {
        return "Cappuccino";
    }

    @Override
    public Double getCost() {
        return 12.0;
    }

}
