fun main(args: Array<String>) {
    println("Iniciando cajero automático")

    //Parte 1 - Generar PIN de forma aleatoria formada por 4 dígitos
    val pin1 = (0..9).random()
    val pin2 = (0..9).random()
    val pin3 = (0..9).random()
    val pin4 = (0..9).random()
    val pin = "$pin1$pin2$pin3$pin4"
    println("Su PIN es: $pin")

    //Parte 2 - Comprobar que el pin introducido es correcto
    var numeroIntentos = 0
    while (numeroIntentos < 3) {
        println("Ingrese su PIN")
        val pinUsuario = readLine()
        if (pinUsuario == pin) {
            println("PIN correcto")
            numeroIntentos = 6
        } else {
            println("PIN incorrecto")
            numeroIntentos += 1
        }
    }

    //Parte 3 - Generar el saldo inicial de forma aleatoria entre 1000 € y 50000 €
    val saldoInicial = (1000..50000).random()
    println("Su saldo inicial es: $saldoInicial €")

    //Parte 4 - Mostrar el menú de operaciones
    if (numeroIntentos == 6) {
        println("Menú de operaciones")
        println("1. Ingresar dinero")
        println("2. Retirar dinero")
        println("3. Consultar saldo")
        println("4. Salir")
        println("Elija una opción")
        val opcion = readLine()?.toInt()
        if (opcion == 1) {
            println("Ha elegido ingresar dinero")
            println("Su saldo es: $saldoInicial €")
            println("¿Cuánto dinero desea ingresar📉?")
            val dineroIngresar = readLine()?.toInt()
            val saldoFinal = saldoInicial + dineroIngresar!!
            println("Su saldo final es: $saldoFinal €")

        } else if (opcion == 2) {
            println("Ha elegido retirar dinero")
            println("Su saldo es: $saldoInicial €")
            println("¿Cuánto dinero desea retirar📈?")
            val dineroRetirar = readLine()?.toInt()
            val saldoFinal = saldoInicial - dineroRetirar!!
            println("Su saldo final es: $saldoFinal €")

        } else if (opcion == 3) {
            println("Ha elegido consultar saldo 📊")
            println("Su saldo es: $saldoInicial €")

        } else if (opcion == 4) {
            println("Cerrando sesión de su terminal de operaciones 😀")

        } else
            println("Opción incorrecta")
    }
}


