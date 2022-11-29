package com.factory.method.romanian;

import com.factory.method.PizzaIngredientFactory;
import com.factory.method.ingredients.*;

public class RomanianPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        System.out.println("Creating thick crust dough");
        return new ThickCrustDough();
    }

    @Override
    public Sauce addSauce() {
        System.out.println("Adding spicy sauce");
        return new SpicySauce();
    }

    @Override
    public Cheese addCheese() {
        System.out.println("Adding feta cheese");
        return new Feta();
    }


}
