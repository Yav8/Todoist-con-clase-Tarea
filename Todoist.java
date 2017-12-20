import java.util.ArrayList;

/**
 * Clase que permite almacenar las tareas pendientes que tenemos por hacer
 */
public class Todoist {
    
    private ArrayList<String> tareas;
    /**
     * Constructor de la clase Todoist.
     */
    public Todoist() {
        tareas = new ArrayList<String>();
    }

    /**
     * Inserta una nueva tarea
     */
    public void addTarea() {
        tareas.add(Tarea.obtenerTarea());
    }

    /**
     * Metodo que imprime todas las tareas existentes, una por linea.
     * El metodo imprime el numero de posicion de la tarea antes del
     * nombre de la tarea. Si la tarea está completada, entonces muestra
     * un "[X]" delante de la tarea; si no está completada muestra un "[ ]"
     */
    public void mostrarTareasNumeradas() {
        
    }

    /**
     * Marca como completada la tarea indicada como parámetro. Por ejemplo,
     * si el parámetro es 0 marca como completada la primera tarea, si es 1 la
     * segunda, etc.
     */
    public void marcarComoCompletada(int indiceTarea) {
        
    }
}