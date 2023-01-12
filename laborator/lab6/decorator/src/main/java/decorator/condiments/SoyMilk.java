package decorator.condiments;

import decorator.Beverage;
import decorator.CondimentDecorator;

public class SoyMilk implements CondimentDecorator {

    private final Beverage beverage;

    public SoyMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "Soy milk";
    }

    @Override
    public Double getCost() {
        return beverage.getCost() + 4.0;
    }
}
