# Use case diagrams

## Use case

Use cases are a way to capture system functionality and requirements in UML. To be properly defined, a use case needs:

- a named piece of functionality
- actors invoking the functionality

## Actor

A use case must be initiated by someone or something outside the scope of the use case (an actor). It does not need to be a human user, any external stimulus may trigger the use case and should be modeled as a use case. 

Usually, actors as represented on the left, with the use cases on the right. 

![alternative-icons-for-actors](https://learning.oreilly.com/api/v2/epubs/urn:orm:book:0596007957/files/httpatomoreillycomsourceoreillyimages187496.png)

Though not part of the official UML specification, it is common to see directional arrows on association lines to indicate who initiates communication with whom. Note that the arrows don’t necessarily restrict the direction of information flow; they simply point from the initiator to the receiver of the communication.

System boundaries can be identified by isolating the functionalities of a particular subject. Anything outside it becomes an actor. 

![boundaries](https://learning.oreilly.com/api/v2/epubs/urn:orm:book:0596007957/files/httpatomoreillycomsourceoreillyimages187502.png)

If an actor can perform all of the tasks of another (abstract) actor, generalization can be used to represent this. The more specific actor points with an arrow with a hollow head towards the more general actor and it means that it can call of it's associated functionalities, plus his own. 

## Use case inclusion

Common functionality can be factored out from several use cases and included. Inclussion is represented as a dashed line, with an open arrow. An included use case is tipically not complete on it's own (think of abstract classes in OOP). Eg: payment vs. pay with paypal/pay with card. 

## Use case extension

If a particular use case can be extended to provide extra functionality, under some optional conditions, a use case can extend another. The difference between inclusion and extension is that an extended use case is a valid use case on it's own. 

Excercise: 
YouTube


Guest:
- login
- register

Regular user: 
- watch video 
