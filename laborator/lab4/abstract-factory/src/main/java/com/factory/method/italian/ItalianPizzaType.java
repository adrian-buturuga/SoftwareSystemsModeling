package com.factory.method.italian;

import com.factory.method.Pizza;

import java.util.Arrays;
import java.util.function.Supplier;

public enum ItalianPizzaType {
    Cheese("Cheese", () -> new ItalianCheesePizza(new ItalianPizzaIngredientFactory())),
    Pepperoni("Pepperoni", () -> new ItalianPepperoniPizza(new ItalianPizzaIngredientFactory())),
    Cherry("Cherry", () -> new ItalianCherryPizza(new ItalianPizzaIngredientFactory()));

    private final Supplier<Pizza> factory;
    private final String type;

    ItalianPizzaType(final String type, final Supplier<Pizza> factory) {
        this.type = type;
        this.factory = factory;
    }

    public Supplier<Pizza> getFactory() {
        return factory;
    }

    public static ItalianPizzaType getPizzaType(String type) {
        return Arrays.stream(values())
                .filter(pizza -> pizza.type.equalsIgnoreCase(type))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Sorry, we don't have this type of pizza"));
    }
}
