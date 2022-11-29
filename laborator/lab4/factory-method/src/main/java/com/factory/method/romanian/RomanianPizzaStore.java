package com.factory.method.romanian;

import static com.factory.method.romanian.RomanianPizzaType.getPizzaType;

import com.factory.method.Pizza;
import com.factory.method.PizzaStore;

public class RomanianPizzaStore implements PizzaStore {

    @Override
    public Pizza createPizza(String pizzaType) {
        System.out.println("Welcome to Romania, land of pizza. We are preparing your order at the moment");
        return getPizzaType(pizzaType).getPizza();
    }

}
