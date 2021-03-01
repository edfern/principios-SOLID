# Dependency Inversion Principle PROBLEM

_La inversión de dependencia sugiere cambiar ("invertir") esta relación. En lugar de hacer referencia directa al módulo de bajo nivel, se debe hacer referencia a su abstracción._


## Problem
Para demostrar este principio veamos el problema.

Demos vida a un automóvil creamos las clases [`Car`](src/main/java/gt/edu/umg/priciple/solid/model/Car.java), [`SeatingStandard`](src/main/java/gt/edu/umg/priciple/solid/model/SeatingStandard.java) y [`Tire`](src/main/java/gt/edu/umg/priciple/solid/model/Tire.java).

![alt text](Class%20Diagram/interface-segregation-principle-PROBLEM.png)

Veamos el código:

[`Car.java`](src/main/java/gt/edu/umg/priciple/solid/model/Car.java)

```java
private final SeatingStandard seatingStandard;
    private final Tire tire;
    public Car(){
        seatingStandard = new SeatingStandard();
        tire = new Tire();
    }
    public String carVehicle(){
        return "Su vehículo esta conformado con estas partes: <br>"+seatingStandard.getName()+"<br>"+tire.getName();
    }
``` 

Este código funcionará y podremos usar [`SeatingStandard`](src/main/java/gt/edu/umg/priciple/solid/model/SeatingStandard.java) y [`Tire`](src/main/java/gt/edu/umg/priciple/solid/model/Tire.java) en nuestra
clase [`Car`](src/main/java/gt/edu/umg/priciple/solid/model/Car.java).

Al declarar [`SeatingStandard`](src/main/java/gt/edu/umg/priciple/solid/model/SeatingStandard.java) y [`Tire`](src/main/java/gt/edu/umg/priciple/solid/model/Tire.java) con la palabra **_new_** hemos unido estrechamente
las tres clases.

Es simple, esto hace que nuestro vehículo sea difícil de probar sino que también
hace que nuestra clase [`SeatingStandard`](src/main/java/gt/edu/umg/priciple/solid/model/SeatingStandard.java) sea complicado cambiar por una clase diferente en el 
caso de que surja la necesidad.   