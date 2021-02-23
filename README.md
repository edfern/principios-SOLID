# Single Responsibility Principle PROBLEM
Este programa realiza una simulación para la generación de un archivo
en un formato que puede ser ***JSON, HTML O CSV***.

- Este principio nos dice que una clase debe de tener una sola 
responsabilidad.

En este caso la clase [ExportFileService](https://github.com/edfern/principios-SOLID/tree/single-responsibility-priciple-problem/src/main/java/gt/edu/umg/priciple/solid/model/service) tiene como obligacion la creación 
de todos los formatos que soporta esta aplicación y no cumple con lo que nos dice este 
principio.
