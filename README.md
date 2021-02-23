# Single Responsibility Principle SOLUTION
Este programa realiza una simulación para la generación de un archivo
en un formato que puede ser ***JSON, HTML O CSV***.

- Este principio nos dice que una clase debe de tener una sola 
responsabilidad.

La solución que se ha dado para que la clase [ExportFileService](https://github.com/edfern/principios-SOLID/tree/single-responsibility-priciple-problem/src/main/java/gt/edu/umg/priciple/solid/model/service) no tenga 
toda la responsabilidad de formatear un archivo a los diferente tipos de formatos que soporta este programada,
es la implementación de la interfaz [IExportFile](https://github.com/edfern/principios-SOLID/tree/single-responsibility-priciple-solution/src/main/java/gt/edu/umg/priciple/solid/model/service)
la cual será la encargada de absorber el metodo ***buildFile***, en este caso es el encargado de generar
el tipo de formato para cada archivo. Con esto limitamos las obligaciones de cada clase y llevar un mejor 
control a la hora de modificar el código.
