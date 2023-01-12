package decorator.factory;

import decorator.Beverage;
import decorator.BeverageFactory;

import java.util.List;

public class DrinkFactory implements BeverageFactory {

    private Beverage createBeverage(String drink) {
        return DrinkTypes.createDrink(drink).get();
    }

    @Override
    public Beverage createBeverage(String drink, List<String> condiments) {
        var beverage = createBeverage(drink);
        for (var condiment : condiments) {
            beverage = CondimentType.createDrink(condiment).get(beverage);
        }
        return beverage;
    }
}
