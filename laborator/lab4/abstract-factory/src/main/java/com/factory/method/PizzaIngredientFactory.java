package com.factory.method;

import com.factory.method.ingredients.*;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce addSauce();
    Cheese addCheese();

}
