/**
 * @author idanirf
 * @date 04/07/2022
 */

//En Kotlin kas funciones son ciudadanos de 1ª Clase, por lo tanto, las funciones son un tipo de dato
fun main(args: Array<String>) {
    println("Protección/Mutabilidad/Variables de solo lectura o variables de lectura y escritura")
    println("val -> variables de solo lectura")
    val nombre = "Ivan"
    println("var -> variables de lectura y escritura")
    var edad = 20
    edad = 19
    println("nombre: $nombre, edad: $edad")
    println("CONSTANTES const val -> variables de solo lectura")
    println("\n")
    println("Tipos de Datos: ")
    println("Numéricos: Int, Long, Float, Double, Short, Byte")
    val numero1: Int = 10
    val numero2: Long = 10L
    val numero3: Float = 10.0F
    val numero4: Double = 10.0
    val numero5: Short = 10
    val numero6: Byte = 10
    println("\n")
    println("Booleanos: Boolean")
    val booleano1: Boolean = true
    val booleano2: Boolean = false
    println("\n")
    println("Caracteres: Char")
    val caracter1: Char = 'a'
    val caracter2: Char = 'b'
    println("\n")
    println("Cadena de caracteres: String")
    val cadena1: String = "Hola"
    val cadena2: String = "Mundo"
    println("\n")
}