fun main() {
    println("Hello, World!")

}
fun marcarComoCompletada(tarea: Tarea) {
    tarea.completada = true
    println("Tarea completada.")
}

fun mostrarInfo(tarea: Tarea) {
    if (tarea.completada)
        println("[:)]")
    else
        println("[:(]")
    print(" " + tarea.id)
    print(" " + tarea.titulo)
    print(" " + tarea.descripcion)
}