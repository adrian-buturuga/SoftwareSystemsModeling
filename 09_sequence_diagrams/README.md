# Interaction (Sequence) Diagrams

Sequence diagrams captures communications between objects, not the data manipulation associated with that communication. A sequence diagram can show, for example, how a subsystem realizes a service it offers on it's public interface. 

## Participants 

Participants in an interaction are shown as rectangles, with a lifeline beneath. The destruction of a participant is deplayes with a stop symbol, below which the dashed lifeline continues no more. 

## Messages

The focus of interaction diagrams is on the communication between lifelines. This communication can take many different forms: method calls, sending a signal, creating an instance, destroying an object, etc., all of which are collectively called messages. A message specifies the kind of communication, its sender, and its receiver. 

The most common use of messages is to represent method calls between two objects. When messages are used to indicate a method call, you can show the parameters passed to the method in the message syntax.

A message is shown as a solid line pointing from the sender's lifeline to the receiver's lifeline. If the message is an asynchronous message (meaning the caller doesn't block waiting for the receiver to process the message), an open arrowhead is placed on the receiver's end of the line.

UML defines two special types of messages: lost messages and found messages . Lost messages are messages that are sent but never reach their destination. Found messages are messages that are received by an object but the sender is unknown. For example, if you want to model an exception-handling mechanism, the sending of the exception is really irrelevant to the mechanism itself, so you can model that as a found message.

## Combined Fragments

Often there are times when a particular sequence of event occurrences has special constraints or properties. For example, you may have a critical region within your interaction where a set of method calls must execute atomically, or a loop that iterates over a collection. UML calls these smaller pieces interaction fragments. An interaction fragment may have a guard condition that states when the fragment is valid (can be executed); as in an “if-then” condition. 

### Interaction Operators

- Alternatives: `alt` 
- Option: `opt`
- Break: `break`
- Parallel: `par`
- Loop: `loop`

Exercise: Nerd dinner