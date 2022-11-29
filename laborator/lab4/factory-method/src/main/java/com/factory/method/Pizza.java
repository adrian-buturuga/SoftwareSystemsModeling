package com.factory.method;

import java.util.List;

public interface Pizza {

    List<String> getIngredients();

    default void bakePizza() {
        System.out.println("Baking at 300 degrees");
    }

    default void box() {
        System.out.println("packaging pizza");
    }

    void prepare();

}
