class ListaTareas {
    val tareas = mutableListOf<Tarea>()

    fun agregarTarea(tarea: Tarea) {
        tareas.add(tarea)
    }

    fun eliminarTarea(id: Int) {
        tareas.remove(tareas.find { it.id == id })
    }

    fun mostrarTareas() {
        if (tareas.isEmpty()) {
            println("No hay tareas en la lista.")
        } else {
            println("Lista de Tareas:")
            tareas.forEachIndexed { index, tarea ->
                println("${index + 1}. $tarea")
            }
        }
    }
    fun buscarTarea(id: Int){
        val tarea = tareas.find { it.id == id }
        if (tarea != null) {
            println("Tarea encontrada: $tarea")
        } else {
            println("No ta")
        }
    }
    fun tareasComletadas(): List<Tarea> {
        return tareas.filter { it.completada }
    }
}