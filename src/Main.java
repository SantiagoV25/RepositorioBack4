import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Bienvenido a la aplicación de gestión de tareas más cuca del barrio. \n Por favor, seleccione una opción para continuar");
        int opcion = 0;
        do {
            System.out.println("1. Ingresar una tarea");
            System.out.println("2. Completar una tarea");
            System.out.println("3. Listar las tareas pendientes");
            System.out.println("4. Listar las tareas completas");
            System.out.println("5. Listar todas las tareas");
            System.out.println("6. Eliminar una tarea");
            System.out.println("7. Actualizar una tarea");
            System.out.println("8. Ver detalle de tarea");
            System.out.println("9. Salir");
            opcion = leer.nextInt();

            switch(opcion) {
                case 1:
                    System.out.println("Ingrese la descripción de la tarea");
                    String tarea = leer.next();
                    TodoList.agregarTarea(tarea);
                    System.out.println("La tarea fue agregada correctamente");
                    break;
                case 2:
                    System.out.println("Completar una tarea");
                    System.out.println("Lista de todas las tareas");
                    System.out.println("Ingresar índice de la tarea a completar");
                    int indice = leer.nextInt();
                    System.out.println("Ingrese el tiempo en minutos que tarda la tarea");
                    int minutos = leer.nextInt();
                    TodoList.completarTarea(indice,minutos);
                    System.out.println("La tarea ha sido completada");
                    break;
                case 3:
                    System.out.println("Lista de tareas por completar");
                    String listaTareasPendientes = TodoList.listarTareasPendientes();
                    System.out.println(listaTareasPendientes);

                    break;
                case 4:
                    System.out.println("Lista de tareas completadas");
                    String listaTareasCompletadas = TodoList.tareasCompletas();
                    System.out.println(listaTareasCompletadas);
                    break;
                case 5:
                    System.out.println("Lista de las tareas ingresadas");
                    String listaTareas = TodoList.listarTareas();
                    System.out.println(listaTareas);
                    break;
                case 6:
                    System.out.println("Eliminar una tarea");
                    System.out.println("Ingrese el indice de la tarea a eliminar");
                    int elimina = leer.nextInt();
                    boolean eliminardetalle = TodoList.eliminarTarea(elimina);
                    if (eliminardetalle){
                        System.out.println("La tarea ha sido eliminada");
                    }else{
                        System.out.println("La tarea ingresada no existe, verificar.");
                    }
                    System.out.println(eliminardetalle);
                    break;
                case 7:
                    System.out.println("Actualizar una tarea");
                    System.out.println("Lista de todas las tareas");
                    System.out.println("Ingrese el indice de la tarea a actualizar");
                    int busca = leer.nextInt();
                    System.out.println("Ingrese la nueva descripción de la tarea");
                    String actualizarDescripcion = leer.next();
                    System.out.println("El registro ha sido cambiado con satisfacción");
                    TodoList.Actualizar(busca,actualizarDescripcion);
                    break;
                case 8:
                    System.out.println("Ver el detalle de una tarea");
                    System.out.println("Ingresar indice de la tarea a examinar");
                    int idDetalle = leer.nextInt();
                    String detalle = TodoList.detalleTarea(idDetalle);

                    System.out.println(detalle);
                    break;
                case 9:
                    System.out.println("Hasta luego, vuelva pronto a su ToDo de confianza");
                    break;
            }

        } while (opcion != 9);
    }
}