package `Tema5-Funciones`

/*
2. PROGRAMACIÓN FUNCIONAL
Ventajas en Kotlin de la programación funcional:
    - Se pueden pasar como argumentos
    - Permite especificar la funcionalidad
    - Se pueden almacenar en una variable y utilizarla
 */

/*Primer caso almacenar una función en una variable, en el apartado 1 vemos como se crea una función que calcula el
módulo de una división.
Ahora vamos a crear la función, pero esta vez la almacenamos en una variable.
 */

val modulo = fun(numA: Int, numB: Int): Int {
    return numA % numB
}
/*
Ahora vamos a crear una función donde creamos la variable al tipo función le pasamos el tipo de parámetros que recibe
y el tipo de dato que devuelve.
En este caso le estamos indicando el comportamiento que tiene.
 */

var modulo2: (Int, Int) -> Int = modulo

/*

 */