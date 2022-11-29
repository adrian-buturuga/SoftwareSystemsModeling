package com.factory.method.italian;

import com.factory.method.Pizza;
import com.factory.method.PizzaStore;

public class ItalianPizzaStore implements PizzaStore {

    @Override
    public Pizza createPizza(String pizzaType) {
        System.out.println("Welcome to Italy, the TRUE land of pizza. We are preparing your order at the moment");
        return ItalianPizzaType.getPizzaType(pizzaType).getFactory().get();
    }

}
