package decorator.condiments;

import decorator.Beverage;
import decorator.CondimentDecorator;

public class Cinnamon implements CondimentDecorator {

    private final Beverage beverage;

    public Cinnamon(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "Cinnamon";
    }

    @Override
    public Double getCost() {
        return beverage.getCost() + 3.0;
    }
}
