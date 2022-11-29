package com.factory.method.romanian;

import com.factory.method.Pizza;
import com.factory.method.PizzaIngredientFactory;

import java.util.List;

public class RomanianDiavolaPizza implements Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public RomanianDiavolaPizza(PizzaIngredientFactory factory) {
        this.pizzaIngredientFactory = factory;
    }


    @Override
    public void prepare() {
        System.out.println("Combining ingredients for romanian diavola pizza: ");
        pizzaIngredientFactory.createDough();
        pizzaIngredientFactory.addSauce();
        pizzaIngredientFactory.addCheese();
    }

}
