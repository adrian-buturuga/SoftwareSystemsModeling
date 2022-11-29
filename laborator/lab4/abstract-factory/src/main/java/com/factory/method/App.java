package com.factory.method;

import com.factory.method.italian.ItalianPizzaStore;
import com.factory.method.romanian.RomanianPizzaStore;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        PizzaStore store = new RomanianPizzaStore();
        store.orderPizza("Cheese");

        System.out.println();

        store = new ItalianPizzaStore();
        store.orderPizza("Pepperoni");
    }
}
