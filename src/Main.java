import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();
        int opcion = 0;

        while (opcion != 3) {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea pendiente

            switch (opcion) {
                case 1:
                    System.out.print("Añade una tarea: ");
                    String tarea = sc.nextLine();
                    gestor.anadirTarea(tarea);
                    break;
                case 2:
                    gestor.listarTareas();
                    break;
                case 3:
                    System.out.println("Saliendo del gestor de tareas.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 3.");
                    break;
            }
        }
    }

    public static void mostrarMenu() {
        System.out.println("\n=== GESTOR DE TAREAS ===");
        System.out.println("1. Añadir tarea");
        System.out.println("2. Listar tareas");
        System.out.println("3. Salir");
        System.out.print("Elige una opción: ");
    }
}
