package com.factory.method;

public interface PizzaStore {

    default Pizza orderPizza(String pizzaType) {

        var pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bakePizza();
        pizza.box();

        return pizza;

    }

    Pizza createPizza(String pizzaType);

}
