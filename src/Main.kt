import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val usuario = Usuario()
    println("Ingrese su nombre:")
    usuario.nombre = scanner.nextLine()
    println("Bienvenido, ${usuario.nombre}!")

    var opcion: Int
    do {
        println(
            """
            Menú:
            1. Agregar Tarea  2. Mostrar tareas  3. Marcar tarea como Completada
            4. Eliminar Tarea por ID  5. Ver solo tareas completadas  6. Salir
        """.trimIndent()
        )
        print("Seleccione una opción: ")
        opcion = scanner.nextInt()
        scanner.nextLine() // Limpiar el buffer

        when (opcion) {

            //Agregar Tarea
            1 -> {
                val tarea = Tarea()
                print("Ingrese el ID de la tarea: ")
                tarea.id = scanner.nextInt()
                scanner.nextLine() // Limpiar el buffer
                print("Ingrese el título de la tarea: ")
                tarea.titulo = scanner.nextLine()
                print("Ingrese la descripción de la tarea: ")
                tarea.descripcion = scanner.nextLine()
                usuario.lista.agregarTarea(tarea)
                println("Tarea agregada.")
            }

            //Mostrar Tareas
            2 -> usuario.lista.mostrarTareas()

            //Marcar tarea como completada
            3 -> {
                print("Ingrese el ID de la tarea a marcar como completada: ")
                val id = scanner.nextInt()
                val tarea = usuario.lista.tareas.find { it.id == id }
                if (tarea != null) {
                    tarea.marcarComoCompletada(tarea)
                } else {
                    println("Tarea no encontrada.")
                }
            }

            //Eliminar Tarea
            4 -> {
                print("Ingrese el ID de la tarea a eliminar: ")
                val id = scanner.nextInt()
                usuario.lista.eliminarTarea(id)
                println("Tarea eliminada si existía.")
            }

            //Ver solo tareas completadas
            5 -> {
                val completadas = usuario.lista.tareasComletadas()
                if (completadas.isEmpty()) {
                    println("No hay tareas completadas.")
                } else {
                    println("Tareas Completadas:")
                    completadas.forEach { println(it) }
                }
            }

            //Salir
            6 -> println("Saliendo...")

            //Error
            else -> println("Opcion no valida")
        }
    } while (opcion != 6)
}