package com.factory.method.romanian;

import com.factory.method.Pizza;

import java.util.Arrays;
import java.util.function.Supplier;

public enum RomanianPizzaType {

    Cheese("Cheese", () -> new RomanianCheesePizza(new RomanianPizzaIngredientFactory())),
    Diavola("Diavola", () -> new RomanianCheesePizza(new RomanianPizzaIngredientFactory())),
    Cherry("Cherry", () -> new RomanianCheesePizza(new RomanianPizzaIngredientFactory()));

    private final Supplier<Pizza> factory;
    private final String type;

    RomanianPizzaType(final String type, final Supplier<Pizza> factory) {
        this.type = type;
        this.factory = factory;
    }

    public Supplier<Pizza> getFactory() {
        return factory;
    }

    public static RomanianPizzaType getPizzaType(String type) {
        return Arrays.stream(values())
                .filter(pizza -> pizza.type.equalsIgnoreCase(type))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Sorry, we don't have this type of pizza now"));
    }

}
