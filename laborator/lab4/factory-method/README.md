``` mermaid
classDiagram
    class Pizza {
        <<Interface>>
        + getIngredients()*: List~String~
        + prepare()*: void
        + bake()*: void
        + box()*: void
    }
    class RomanianCherryPizza {
        + getIngredients(): List~String~
        + prepare(): void
    }
    class RomanianCheesePizza {
        + getIngredients(): List~String~
        + prepare(): void
    }
    class RomanianDiavolaPizza {
        + getIngredients(): List~String~
        + prepare(): void
    }
    class ItalianCherryPizza {
        + getIngredients(): List~String~
        + prepare(): void
    }
    class ItalianCheesePizza {
        + getIngredients(): List~String~
        + prepare(): void
    }
    class ItalianPepperoniPizza {
        + getIngredients(): List~String~
        + prepare(): void
    }

    Pizza <|-- RomanianCherryPizza
    Pizza <|-- RomanianCheesePizza
    Pizza <|-- RomanianDiavolaPizza
    Pizza <|-- ItalianCherryPizza
    Pizza <|-- ItalianCheesePizza
    Pizza <|-- ItalianPepperoniPizza

    class PizzaStore {
        <<Interface>>
        + orderPizza()*: Pizza
        + createPizza()*: Pizza
    }
    class ItalianPizzaStore {
        + createPizza(): Pizza
    }
    class RomanianPizzaStore {
        + createPizza(): Pizza
    }
    
    PizzaStore <|-- RomanianPizzaStore
    PizzaStore <|-- ItalianPizzaStore
    PizzaStore --> Pizza
    
    class ItalianPizzaType {
        <<Enum>>
        - factory: Supplier~Pizza~
        - type: String
        - ItalianPizzaType()
        + getFactory(): Supplier~factory~
        + getPizzaType(type)$: ItalianPizzaType
    }
    class RomanianPizzaType {
        <<Enum>>
        - factory: Supplier~Pizza~
        - type: String
        - RomanianPizzaType()
        + getFactory(): Supplier~factory~
        + getPizzaType(type): RomanianPizzaType
    }

    ItalianPizzaStore --> ItalianPizzaType
    RomanianPizzaStore --> RomanianPizzaType

```