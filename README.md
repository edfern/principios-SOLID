# Interface Segregation Principle SOLUTION

_Las interfaces juegan un papel importante en el lenguaje de programación Java y se usan ampliamente para abstracción y para soportar múltiples herencias._

En el principio de segregación de interfaces, la interfaz no debe tener métodos que no requieran las clases de implementación. Las clases de implementación no están obligadas por ningún motivo a proporcionar implementaciones para aquellos métodos que no necesita. La adición de un método o el cambio de una firma de método a la interfaz requiere cambiar todas las clases implementadas en esta interfaz.

El Principio de Segregación de Interfaces sugiere segregar una interfaz en interfaces más pequeñas y altamente cohesivas , conocidas como "interfaces de función" y cada "interfaz de función" declara uno o más métodos para un comportamiento específico. Por lo tanto, los clientes, en lugar de implementar una interfaz, implementa solo aquellas "interfaces de función" cuyos métodos son relevantes.

## Solution
Siguiendo el Principio de Segregación de Interfaces, podemos abordar el problema de la interfaz [`ISecurityPermission`](https://github.com/edfern/principios-SOLID/blob/interface-segregation-principle-problem/src/main/java/gt/edu/umg/priciple/solid/model/ISecurityPermission.java)
la solucion es segregar la interfaz de los usuarios en multiples interfaces de función 
cada una para un comportamiento específico . En este caso, la interfaz [`ISecurityPermission`](https://github.com/edfern/principios-SOLID/blob/interface-segregation-principle-problem/src/main/java/gt/edu/umg/priciple/solid/model/ISecurityPermission.java)
se puede dividir en tres interfaces `IAdminPermission`, `IUserPermission` y `ITechnicalPermission`  

![alt text](Class%20Diagram/interface-segregation-principle-SOLUTION.png)

Ahora las clases de implementación implementan las interfaces que les interesan y esto ayuda a eliminar el código innecesario y es más legible.

## Conclution
El principio de segregación de interfaces garantiza componentes de software pequeños, enfocados y altamente cohesivos. El principio de segregación de interfaces es fácil de entender y de seguir. Sin embargo, identificar las distintas interfaces puede ser un desafío para obtener la segregación de roles correcta. El Principio de Segregación de Interfaces es un concepto muy poderoso para dominar al desarrollar aplicaciones Java.
