package com.factory.method.italian;

import com.factory.method.Pizza;

public class ItalianCheesePizza implements Pizza {

    ItalianPizzaIngredientFactory ingredientFactory;

    public ItalianCheesePizza(ItalianPizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Combining ingredients for italian cheese pizza: ");
        ingredientFactory.createDough();
        ingredientFactory.addCheese();
        ingredientFactory.addSauce();
    }

}
