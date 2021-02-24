# Open/Closed Principle PROBLEM

* Este principio establece que un modulo debe de estar abierto a la extensión pero cerrado para modificaciones.
* ***Abierto para extensión:***  Esto significa que el comportamiento del módulo se puede extender. A medida que cambian los requisitos de la aplicación, podemos ampliar el módulo con nuevos comportamientos que satisfagan esos cambios. En otras palabras, podemos cambiar lo que hace el módulo.
* ***Cerrado por modificación:*** Extender el comportamiento de un módulo no da como resultado cambios en el código fuente o binario del módulo. La versión ejecutable binaria del módulo, ya sea en una biblioteca enlazable, una DLL o un .jar de Java, permanece intacta.

Este programa tiene como objetivo hacer que un texto se convierta en formato
***HTML, CSV O JSON*** 
En la clase [***FactoryTextService***]() el código se ve bien y cumple con su proposito 
el cual es buscar una clase el cual implemente la interfaz [***ITextService***]() pero cuando un desarrollador
desea agregar un nuevo tipo de formato no tiene otra salida que modificar `getText()` de la clase [***FactoryTextService***]().
Por eso este código no cumple con lo que dice este principio.

