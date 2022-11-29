package com.factory.method.romanian;

import com.factory.method.Pizza;

import java.util.Arrays;
import java.util.function.Supplier;

public enum RomanianPizzaType {
    Cheese("Cheese", RomanianCheesePizza::new),
    Diavola("Diavola", RomanianDiavolaPizza::new),
    Cherry("Cherry", RomanianCherryPizza::new);

    private final String type;
    private final Supplier<Pizza> pizzaSupplier;

    RomanianPizzaType(final String type, final Supplier<Pizza> pizzaSupplier) {
        this.type = type;
        this.pizzaSupplier = pizzaSupplier;
    }

    public Pizza getPizza() {
        return pizzaSupplier.get();
    }

    public static RomanianPizzaType getPizzaType(String type) {
        return Arrays.stream(values())
                .filter(pizza -> pizza.type.equalsIgnoreCase(type))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Sorry, we don't have this type of pizza now"));
    }

}
