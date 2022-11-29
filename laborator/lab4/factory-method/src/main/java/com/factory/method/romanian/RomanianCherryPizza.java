package com.factory.method.romanian;

import com.factory.method.Pizza;

import java.util.List;

public class RomanianCherryPizza implements Pizza {

    private final List<String> ingredients = List.of("dough", "tomato", "cherry tomato", "mozzarella");

    @Override
    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public void prepare() {
        System.out.println("Combining ingredients for romanian cherry pizza: " + String.join(", ", getIngredients()));
    }

}
