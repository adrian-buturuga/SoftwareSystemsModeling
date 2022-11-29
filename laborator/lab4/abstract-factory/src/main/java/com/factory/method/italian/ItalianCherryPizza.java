package com.factory.method.italian;

import com.factory.method.Pizza;

public class ItalianCherryPizza implements Pizza {

    ItalianPizzaIngredientFactory ingredientFactory;

    public ItalianCherryPizza(ItalianPizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Combining ingredients for italian cherry pizza: ");
        ingredientFactory.createDough();
        ingredientFactory.addCheese();
        ingredientFactory.addSauce();
    }

}
