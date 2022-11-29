package com.factory.method;


public interface Pizza {

    default void bakePizza() {
        System.out.println("Baking at 300 degrees");
    }

    default void box() {
        System.out.println("packaging pizza");
    }

    void prepare();

}
