package com.factory.method.romanian;

import com.factory.method.Pizza;
import com.factory.method.PizzaIngredientFactory;

public class RomanianCheesePizza implements Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public RomanianCheesePizza(PizzaIngredientFactory factory) {
        this.pizzaIngredientFactory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Combining ingredients for romanian cheese pizza: ");
        pizzaIngredientFactory.createDough();
        pizzaIngredientFactory.addSauce();
        pizzaIngredientFactory.addCheese();
    }

}
