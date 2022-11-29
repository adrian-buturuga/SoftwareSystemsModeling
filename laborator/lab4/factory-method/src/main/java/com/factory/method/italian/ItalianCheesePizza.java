package com.factory.method.italian;

import com.factory.method.Pizza;

import java.util.List;

public class ItalianCheesePizza implements Pizza {

    private final List<String> ingredients = List.of("dough", "tomato", "mozzarella", "gorgonzola", "parmigiano", "goat cheese");

    @Override
    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public void prepare() {
        System.out.println("Combining ingredients for italian cheese pizza: " + String.join(", ", getIngredients()));
    }

}
