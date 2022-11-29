package com.factory.method.italian;

import com.factory.method.Pizza;

import java.util.Arrays;
import java.util.function.Supplier;

public enum ItalianPizzaType {
    Cheese("Cheese", ItalianCheesePizza::new),
    Pepperoni("Pepperoni", ItalianPepperoniPizza::new),
    Cherry("Cherry", ItalianCherryPizza::new);

    private final String type;
    private final Supplier<Pizza> pizzaSupplier;

    ItalianPizzaType(final String type, final Supplier<Pizza> factory) {
        this.type = type;
        this.pizzaSupplier = factory;
    }

    public Pizza getPizza() {
        return pizzaSupplier.get();
    }

    public static ItalianPizzaType getPizzaType(String type) {
        return Arrays.stream(values())
                .filter(pizza -> pizza.type.equalsIgnoreCase(type))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Sorry, we don't have this type of pizza"));
    }
}
