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

val moduloA = fun(numA: Int, numB: Int): Int {
    return numA % numB
}
/*
Ahora vamos a crear una función donde creamos la variable al tipo función le pasamos el tipo de parámetros que recibe
y el tipo de dato que devuelve.
En este caso le estamos indicando el comportamiento que tiene.
 */

var modulo2: (Int, Int) -> Int = moduloA

/*
Ahora creamos una función la cual indicamos su comportamiento en base al tipo de dato que queremos.
a y b serán los datos que utilicemos en la función y con los que vamos a operar, serán de tipo entero.
 */

var modul: (Int, Int) -> Int = { a, b -> a % b }
var modul2 = { a: Int, b: Int -> a % b }


/*
Creamos nuestro main y probamos las funciones que hemos creado anteriormente introducimos unos datos aleatorios
y si hacemos una comprobación con la calculadora podemos comprobar que el resultado es el mismo.
 */
fun main() {
    println(moduloA(10, 4))
    println(modulo2(10, 3))
    println(modul(10, 10))
    println(modul2(10, 3))
}
