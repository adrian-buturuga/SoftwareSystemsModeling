package decorator.drinks;

import decorator.Beverage;

public class Latte implements Beverage {
    @Override
    public String getDescription() {
        return "Latte";
    }

    @Override
    public Double getCost() {
        return 14.0;
    }
}
