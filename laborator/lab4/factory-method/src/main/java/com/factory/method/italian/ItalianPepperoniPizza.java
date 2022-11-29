package com.factory.method.italian;

import com.factory.method.Pizza;

import java.util.List;

public class ItalianPepperoniPizza implements Pizza {

    private final List<String> ingredients = List.of("dough", "tomato", "pepperoni", "mozzarella");

    @Override
    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public void prepare() {
        System.out.println("Combining ingredients for italian pepperoni pizza: " + String.join(", ", getIngredients()));
    }

}
