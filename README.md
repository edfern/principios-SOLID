# Dependency Inversion Principle SOLUTION

_La inversión de dependencia sugiere cambiar ("invertir") esta relación. En lugar de hacer referencia directa al módulo de bajo nivel, se debe hacer referencia a su abstracción._


## Solution
Desacoplamos nuestro vehículo del [`SeatingStandard`](src/main/java/gt/edu/umg/priciple/solid/model/SeatingStandard.java)
agregando una interfaz del **_seating_** más general y usándola en nuestra clase:

```java
public interface ISeating {
}
```

```java
public class Car {

    private final ISeating iSeating;
    private final ITire tire;
    public Car(ISeating iSeating, ITire iTire){
        this.iSeating = iSeating;
        this.tire = iTire;
    }
    //Crea el automóvil y muestra sus partes.
    public String carVehicle(){
        return "Su vehículo esta conformado con estas partes: <br>"+iSeating.getName()+"<br>"+tire.getName();
    }
}

```
También modificamos la clase [`SeatingStandard`](src/main/java/gt/edu/umg/priciple/solid/model/SeatingStandard.java) para implementar la interfaz
del **_ITire_** para que sea adecuada inyectar en la clase [`Car`](src/main/java/gt/edu/umg/priciple/solid/model/Car.java).

```java
public class SeatingStandard implements ISeating{
}
```
Ahora nuestras clases están desacopladas y se comunican a través de la abstracción
_ISeating_.

Si queremos, podemos cambiar fácilmente el tipo de asientos en nuestro vehículo con una implementación diferente de la interfaz. Podemos seguir el mismo principio para la clase _Tire_.