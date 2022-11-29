package com.factory.method.italian;

import com.factory.method.Pizza;

public class ItalianPepperoniPizza implements Pizza {

    ItalianPizzaIngredientFactory ingredientFactory;

    public ItalianPepperoniPizza(ItalianPizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Combining ingredients for italian pepperoni pizza: ");
        ingredientFactory.createDough();
        ingredientFactory.addCheese();
        ingredientFactory.addSauce();
    }

}
