import java.util.Scanner;

/**
 * Clase principal que gestiona el sistema de empleados.
 */
public class SistemaGestionEmpleados {

    /**
     * Método principal que inicia la aplicación.
     * @param args Argumentos de línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        Empleados empleados = new Empleados(); // Crear objeto para gestionar empleados

        // Añadir empleados predefinidos
        empleados.altaEmpleado(new Empleado("Juan", "Desarrollador", 50000));
        empleados.altaEmpleado(new Empleado("María", "Diseñadora", 45000));
        empleados.altaEmpleado(new Empleado("Pedro", "Gerente", 60000));

        Scanner scanner = new Scanner(System.in); // Objeto Scanner para entrada de usuario

        // Solicitar al usuario el porcentaje de aumento de salario
        System.out.print(Textos.INGRESAR_PORCENTAJE_AUMENTO);
        double porcentaje = scanner.nextDouble();

        // Aumentar el salario de los empleados según el porcentaje proporcionado
        empleados.aumentarSalario(porcentaje);
        
        // Mostrar la lista de empleados actualizada
        System.out.println(Textos.LISTA_EMPLEADOS);
        for (Empleado empleado : empleados.getLista()) {
            System.out.println(empleado);
        }

        scanner.close(); // Cerrar el Scanner
    }
}
