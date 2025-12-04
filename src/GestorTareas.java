import java.util.ArrayList;

public class GestorTareas {
    private final ArrayList<String> tareas;

    public GestorTareas() {
        this.tareas = new ArrayList<>();
    }

    public void anadirTarea(String tarea) {
        tareas.add(tarea);
        System.out.println("Tarea añadida correctamente.");
    }

    public void listarTareas() {
        System.out.println("\n--- Lista de Tareas ---");
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas en la lista.");
        } else {
            for (int i = 0; i < tareas.size(); i++) {
                System.out.println((i + 1) + ". " + tareas.get(i));
            }
        }
        System.out.println("-----------------------");
    }
}
