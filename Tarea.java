
public class Tarea {
    private String tarea;
    private boolean tareaCompletada;
    
    public Tarea(String tarea, boolean tareaCompletada) {
        this.tarea = tarea;
        this.tareaCompletada = tareaCompletada;
    }
    
    public String obtenerTarea() {
        return tarea;
    }
    
    public boolean obtenerTareaCompletada() {
        return tareaCompletada;
    }
}
