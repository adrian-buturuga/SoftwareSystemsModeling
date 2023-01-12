package decorator.factory;

import decorator.Beverage;
import decorator.drinks.Cappuccino;
import decorator.drinks.Espresso;
import decorator.drinks.Latte;

import java.util.Arrays;
import java.util.function.Supplier;

public enum DrinkTypes {

    Espresso("Espresso", Espresso::new),
    Cappuccino("Cappuccino", Cappuccino::new),
    Latte("Latte", Latte::new);

    private final String type;
    private final Supplier<Beverage> beverageSupplier;

    DrinkTypes(String type, Supplier<Beverage> beverageSupplier) {
        this.type = type;
        this.beverageSupplier = beverageSupplier;
    }

    public Beverage get() {
        return this.beverageSupplier.get();
    }

    public static DrinkTypes createDrink(String drinkType) {
        return Arrays.stream(values())
                .filter(drink -> drinkType.equalsIgnoreCase(drink.type))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Drink not available at the moment"));
    }
}
