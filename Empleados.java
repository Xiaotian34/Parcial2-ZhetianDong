/**
 * Clase que representa un conjunto de empleados.
 */
public class Empleados {
    private Empleado[] lista; // Lista de empleados

    /**
     * Constructor de la clase Empleados.
     * Inicializa la lista de empleados como un array vacío.
     */
    public Empleados() {
        this.lista = new Empleado[0];
    }

    /**
     * Método para mostrar los empleados en la lista.
     */
    public void mostrarEmpleados() {
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }

    /**
     * Método para aumentar el salario de todos los empleados en un porcentaje dado.
     * @param porcentaje El porcentaje de aumento del salario.
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    /**
     * Método para añadir un nuevo empleado a la lista.
     * @param empleado El empleado a añadir.
     */
    public void altaEmpleado(Empleado empleado) {
        Empleado[] nuevaLista = new Empleado[lista.length + 1];
        for (int i = 0; i < lista.length; i++) {
            nuevaLista[i] = lista[i];
        }
        nuevaLista[lista.length] = empleado;
        lista = nuevaLista;
    }

    /**
     * Método para obtener la lista de empleados.
     * @return La lista de empleados.
     */
    public Empleado[] getLista() {
        return lista;
    }

    /**
     * Método para establecer una nueva lista de empleados.
     * @param lista La nueva lista de empleados.
     */
    public void setLista(Empleado[] lista) {
        this.lista = lista;
    }
}
