package `Tema5-Funciones`

/*
1. INTRODUCCIÓN A LAS FUNCIONES_BÁSICAS
Las funciones en Kotlin son iguales/parecidas a las funciones en Java u otros lenguajes.
Como en java u otros lenguajes tenemos funciones que podemos pasar parámetros de entrada, o no pasar parámetros de entrada
o que realicen una acción y devuelva un resultado o no devuelva ningún resultado.
*/

    fun main(Args: Array<String>) {
        //Pasamos los parámetros de entrada e imprimimos el resultado de la función.
        val result = modulo(10, 3)
        println(result)

        //Llamamos a la función y pasamos la edad de una persona.
        edad(20)

    }
    //Función módulo que le vamos a pasar los parámetros de entrada y devolverá el resto de la división.
    fun modulo(dividendo: Int, divisor: Int): Int {
        return dividendo % divisor
    }

    //Función que recibe la edad de una persona y devuelve mediante pantalla la edad recibida
    fun edad(edad: Int) {
        println("La edad es $edad")
    }

// CONTINUAR CON EL SIGUIENTE PUNTO 2.PROGRAMACIÓN FUNCIONAL
