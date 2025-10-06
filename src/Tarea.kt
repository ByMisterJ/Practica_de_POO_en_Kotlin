class Tarea {
    var id: Int = 0
    var titulo: String? = null
    var descripcion: String? = null
    var completada: Boolean = false

    fun marcarComoCompletada(tarea: Tarea) {
        tarea.completada = true
        println("Tarea completada.")
    }

    fun mostrarInfo(tarea: Tarea) {
        if (tarea.completada)
            println("[completada]")
        else
            println("[sin completar]")
        print(" " + tarea.id)
        print(" " + tarea.titulo)
        print(" " + tarea.descripcion)
    }
}

