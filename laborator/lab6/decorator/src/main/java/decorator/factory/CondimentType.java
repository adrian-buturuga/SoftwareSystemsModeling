package decorator.factory;

import decorator.Beverage;
import decorator.condiments.Cinnamon;
import decorator.condiments.SoyMilk;

import java.util.Arrays;
import java.util.function.UnaryOperator;

public enum CondimentType {

    SoyMilk("SoyMilk", SoyMilk::new),
    Cinnamon("Cinnamon", Cinnamon::new);

    private final String type;
    private final UnaryOperator<Beverage> beverage;

    CondimentType(String type, UnaryOperator<Beverage> beverage) {
        this.type = type;
        this.beverage = beverage;
    }

    public Beverage get(Beverage createdBeverage) {
        return beverage.apply(createdBeverage);
    }

    public static CondimentType createDrink(String condimentType) {
        return Arrays.stream(values())
                .filter(condiment -> condimentType.equalsIgnoreCase(condiment.type))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Condiment not available at the moment"));
    }
}
