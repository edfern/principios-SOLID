# Open/Closed Principle SOLUTION

_Este principio establece que un modulo debe de estar abierto a la `extensión` pero cerrado para `modificaciones`._

* ***Abierto para extensión:***  Esto significa que el comportamiento del módulo se puede extender. A medida que cambian los requisitos de la aplicación, podemos ampliar el módulo con nuevos comportamientos que satisfagan esos cambios. En otras palabras, podemos cambiar lo que hace el módulo.

* ***Cerrado por modificación:*** Extender el comportamiento de un módulo no da como resultado cambios en el código fuente o binario del módulo. La versión ejecutable binaria del módulo, ya sea en una biblioteca enlazable, una DLL o un .jar de Java, permanece intacta.

Como vimos en [Open/Closed Principle PROBLEM]() no cumplia con este principio ya que al momento de implementar 
otro formato tendría que modificar `getText()` de la clase [***FactoryTextService***](https://github.com/edfern/principios-SOLID/blob/open-closed-principle-problem/src/main/java/gt/edu/umg/priciple/solid/model/service/FactoryTextService.java).

## Solution 

Se removio la clase [***FactoryTextService***](https://github.com/edfern/principios-SOLID/blob/open-closed-principle-problem/src/main/java/gt/edu/umg/priciple/solid/model/service/FactoryTextService.java) y creamos una nueva clase [TextFormatService]() con el metodo
`getFormat()` con esto podemos agregar nuevos formatos sin modificar el modulo `TextFormatService`. 
Cualquier nueva operación encajará fácilmente. Por ejemplo, el formato `txt`.

## Conclution
El principio open-closed es una guía para el diseño general de clases e interfaces y cómo los desarrolladores pueden construir código que permita cambios con el tiempo.

