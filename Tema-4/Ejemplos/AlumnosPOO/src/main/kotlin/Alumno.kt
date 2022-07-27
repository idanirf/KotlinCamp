open class Alumno(
    var name: String? = "Daniel",
    var apellidos: String? = "Rodriguez",
    var edad: Int? = 19,
    var curso: String? = "2DAM"
) {
    fun toPrint(): String {
        return "$name $apellidos $edad $curso"
    }
}
