class Usuario {
    var nombre: String = ""
    var lista: ListaTareas = ListaTareas()

    fun saludar() {
        println("Hola, soy $nombre!")
        println("Estas son mis tareas:")
        lista.mostrarTareas()
    }
}