# Liskov Substitution Principle SOLUTION

_Es uno de los principios que hace referencia a cómo usamos la herencia de forma adecuada._
Nos dice algo como lo siguiente, _**si `S` es un subtipo de `T`, `T` puede ser reemplazado con objetos de tipo `S`**_ 
sin alterar el comportamiento esperado en el programa.

## Solution
Podemos aplicar el Principio de Substitución de Liskov de forma estricta y rediseñar nuestra jerarquía de clases. Vamos a verlo:
![alt text](https://raw.githubusercontent.com/edfern/principios-SOLID/liskov-substitution-principle-problem/Class%20Diagram/liskov-substitution-principle-PROBLEM.png)

En este caso hemos redefinido el concepto de `PersonEntity` para incluir menos información. 
Ahora sí el niño es una Persona ya que siempre tiene **_nombres_** y **_apellidos_**. 
Es la clase `AdultEntity` la que incorpora el Dni y la tarjeta para pagar. De esta forma todo es más reutilizable. 

Si queremos que el niño pueda pagar algo lo hará delegando en la clase `AdultEntity` que es la que puede pagar con la figura de tutor . 