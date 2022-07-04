# Temas 1, 2 y 3
## Tema 1: Kotlin - Introducción
* ¿Qué es Kotlin?
<br>
Kotlin es un lenguaje de programación de tipado estático que corre sobre la máquina virtual de Java y que también puede ser compilado a código fuente de JavaScript. Es desarrollado principalmente por JetBrains en sus oficinas de San Petersburgo (Rusia). El nombre proviene de la isla de Kotlin, situada cerca de San Petersburgo.

* ¿Que proposito tiene y diferencias con JAVA?
<br>
Se caracteriza por una perfecta combinación de características claramente orientadas a la funcionalidad durante la programación, centrándose en la seguridad, la claridad y la interoperabilidad.
Los programas en Kotlin pueden utilizar los frameworks y librerías de Java existentes. 
Así mismo, su interoperabilidad no requiere capas de adaptación.
Kotlin elimina el código repetitivo, lo que elimina en gran medida los posibles errores. Posee características como delegaciones, inicializaciones tardías, etc y también aborda la seguridad de tipos en las listas, que es un problema importante en Java. El sistema de tipos de Kotlin está destinado a eliminar NullPointerException del código.


## Tema 2: Fundamentos del Lenguaje
**1. Tipos de datos**
* Cadena de carácteres: String

<br>

    val cadena1: String = "Hola"
    val cadena2: String = "Mundo"
* Numéricos: Int, Long, Float, Double, Short, Byte

<br>

    val numero1: Int = 10
    val numero2: Long = 10L
    val numero3: Float = 10.0F
    val numero4: Double = 10.0
    val numero5: Short = 10
    val numero6: Byte = 10
* Booleanos: Boolean

<br>

    val booleano1: Boolean = true
    val booleano2: Boolean = false
* Caracteres: Char 

<br>

    val caracter1: Char = 'a'
    val caracter2: Char = 'b'

 **2. Protección/Mutabilidad/Variable de solo lectura**
 <br>
 * val -> solo lectura
 * var -> lectura y escritura
<br>

**3. Nullable in Kotlin**
<br>
* `val num: Int? = null`

## Tema 3: Definción de Funciones