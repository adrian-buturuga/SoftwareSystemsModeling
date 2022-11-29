package com.factory.method.romanian;

import com.factory.method.Pizza;

import java.util.List;

public class RomanianCheesePizza implements Pizza {

    private final List<String> ingredients = List.of("dough", "tomato", "mozzarella", "gorgonzola", "parmigiano", "goat cheese");

    @Override
    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public void prepare() {
        System.out.println("Combining ingredients for romanian cheese pizza: " + String.join(", ", getIngredients()));
    }

}
