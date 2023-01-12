package decorator;

import decorator.condiments.Cinnamon;
import decorator.condiments.SoyMilk;
import decorator.drinks.Cappuccino;
import decorator.factory.DrinkFactory;

import java.util.List;

public class App
{
    public static void main( String[] args ) {
//        Beverage beverage = new SoyMilk(new Cinnamon(new Cappuccino()));
//        System.out.println(beverage.getCost());

        BeverageFactory factory = new DrinkFactory();
        Beverage drink = factory.createBeverage("Cappuccino", List.of("SoyMilk", "Cinnamon"));
        System.out.println(drink.getCost());
    }
}
