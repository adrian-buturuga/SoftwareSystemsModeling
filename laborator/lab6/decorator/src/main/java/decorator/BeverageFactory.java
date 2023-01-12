package decorator;

import java.util.List;

public interface BeverageFactory {

    Beverage createBeverage(String drink, List<String> condiments);

}
