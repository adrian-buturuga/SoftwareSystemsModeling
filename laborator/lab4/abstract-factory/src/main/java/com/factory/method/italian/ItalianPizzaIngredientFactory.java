package com.factory.method.italian;

import com.factory.method.PizzaIngredientFactory;
import com.factory.method.ingredients.*;

public class ItalianPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        System.out.println("Creating thin crust dough");
        return new ThinCrustDough();
    }

    @Override
    public Sauce addSauce() {
        System.out.println("Adding sweet sauce");
        return new SweetSauce();
    }

    @Override
    public Cheese addCheese() {
        System.out.println("Adding mozzarella cheese");
        return new Mozzarella();
    }

}
