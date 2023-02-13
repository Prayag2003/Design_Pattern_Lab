# Design_Pattern_Lab

# Adapter Pattern

## Source : (https://www.geeksforgeeks.org/adapter-pattern/)

This pattern is easy to understand as the real world is full of adapters.For example consider a USB to Ethernet adapter. We need this when we have an Ethernet interface on one end and USB on the other. Since they are incompatible with each other. we use an adapter that converts one to other. This example is pretty analogous to Object Oriented Adapters. In design, adapters are used when we have a class (Client) expecting some type of object and we have an object (Adaptee) offering the same features but exposing a different interface.

## To use an Adapter :

The client makes a request to the adapter by calling a method on it using the target interface.
The adapter translates that request on the adaptee using the adaptee interface.
Client receive the results of the call and is unaware of adapter’s presence.


![Adapter_Pattern](https://user-images.githubusercontent.com/94465961/218531681-2befa39e-54ba-4710-a63a-09f27bb22a3a.jpg)
