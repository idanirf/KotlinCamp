open class Alumno(
    var name: String? = "Daniel",
    var apellidos: String? = "Rodriguez",
    var edad: Int? = 0,
    var curso: String? = ""
) {
    fun getNombreCompleto(): String {
        return "$name $apellidos"
    }
}
