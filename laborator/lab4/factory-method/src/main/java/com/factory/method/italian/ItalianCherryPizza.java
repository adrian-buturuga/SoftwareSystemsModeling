package com.factory.method.italian;

import com.factory.method.Pizza;

import java.util.List;

public class ItalianCherryPizza implements Pizza {

    private final List<String> ingredients = List.of("dough", "tomato", "cherry tomato", "mozzarella");

    @Override
    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public void prepare() {
        System.out.println("Combining ingredients for italian cherry pizza: " + String.join(", ", getIngredients()));
    }

}
