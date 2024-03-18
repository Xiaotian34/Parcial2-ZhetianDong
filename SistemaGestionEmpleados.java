import java.util.Scanner;

public class SistemaGestionEmpleados {

    public static void main(String[] args) {
        Empleados empleados = new Empleados();

        empleados.altaEmpleado(new Empleado("Juan", "Desarrollador", 50000));
        empleados.altaEmpleado(new Empleado("María", "Diseñadora", 45000));
        empleados.altaEmpleado(new Empleado("Pedro", "Gerente", 60000));

        Scanner scanner = new Scanner(System.in);
        System.out.print(Textos.INGRESAR_PORCENTAJE_AUMENTO); // Utilizando la constante
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);
        
        System.out.println(Textos.LISTA_EMPLEADOS); // Utilizando la constante
        for (Empleado empleado : empleados.getLista()) {
            System.out.println(empleado);
        }

        scanner.close();
    }
}
