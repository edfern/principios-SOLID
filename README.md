# Interface Segregation Principle PROBLEM

_Las interfaces juegan un papel importante en el lenguaje de programación Java y se usan ampliamente para abstracción y para soportar múltiples herencias._

En el principio de segregación de interfaces, la interfaz no debe tener métodos que no requieran las clases de implementación. Las clases de implementación no están obligadas por ningún motivo a proporcionar implementaciones para aquellos métodos que no necesita. La adición de un método o el cambio de una firma de método a la interfaz requiere cambiar todas las clases implementadas en esta interfaz.

El Principio de Segregación de Interfaces sugiere segregar una interfaz en interfaces más pequeñas y altamente cohesivas , conocidas como "interfaces de función" y cada "interfaz de función" declara uno o más métodos para un comportamiento específico. Por lo tanto, los clientes, en lugar de implementar una interfaz, implementa solo aquellas "interfaces de función" cuyos métodos son relevantes.

Esta aplicación le asigna permisos a los diferentes usuarios que soporta
`Admin`, `User` y `Technical` cada usuario tendrá permisos específicos.
* El administrador puede leer, escribir y borrar.
* El usuario puede leer.
* El Técnico pero leer y escribir.

![alt text](Class%20Diagram/interface-segregation-principle-PROBLEM.png)


## Problem
Como pueden ver la clase `UserApp` necesita proporcionar un método `writePermission()` y 
`deletionPermission()` aunque no los requiera.  Esta es una violación del principio de segregación de interfaces. Estos pueden afectar la legibilidad del código.
