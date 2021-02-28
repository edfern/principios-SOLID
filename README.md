# Liskov Substitution Principle PROBLEM

_Es uno de los principios que hace referencia a cómo usamos la herencia de forma adecuada._
Nos dice algo como lo siguiente, _**si `S` es un subtipo de `T`, `T` puede ser reemplazado con objetos de tipo `S`**_ 
sin alterar el comportamiento esperado en el programa.

## Problem
Como podemos ver se tratan de dos clases sencillas `PersonEntity` y `KidEntity`.
En este caso vamos a heredar la clase Niño ya que un niño “es una Persona” por lo tanto es correcto usar la herencia ya que estamos ante una relación de categorización o ¿quizás no?.
![alt text](https://raw.githubusercontent.com/edfern/principios-SOLID/liskov-substitution-principle-problem/Class%20Diagram/liskov-substitution-principle-PROBLEM.png)

Rápidamente comienzan los problemas , el niño no tiene Dni , no tiene tarjeta y gracias a dios no puede pagar nada. Sin embargo sí es un tipo de Persona y cumple con la relación “is a “. ¿Qué es lo que está sucediendo? . Lo que esta sucediendo es que No estamos aplicando el Principio de Substitución de Liskov .   No podemos sustituir la clase padre (T) por la clase hija (S) en muchos lugares del programa sin que esto implique un cambio de comportamiento importante. Para que la clase Hija sea simplemente coherente deberíamos hacer algo como: