/**
 * Clase que representa a un empleado.
 */
public class Empleado {
    private String nombre; // Nombre del empleado
    private String cargo; // Cargo del empleado
    private double salario; // Salario del empleado

    /**
     * Constructor de la clase Empleado.
     * @param nombre Nombre del empleado.
     * @param cargo Cargo del empleado.
     * @param salario Salario del empleado.
     */
    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    /**
     * Método para obtener el nombre del empleado.
     * @return El nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del empleado.
     * @param nombre El nuevo nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el cargo del empleado.
     * @return El cargo del empleado.
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Método para establecer el cargo del empleado.
     * @param cargo El nuevo cargo del empleado.
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Método para obtener el salario del empleado.
     * @return El salario del empleado.
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Método para establecer el salario del empleado.
     * @param salario El nuevo salario del empleado.
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Método toString que devuelve una representación en cadena del objeto Empleado.
     * @return La representación en cadena del objeto Empleado.
     */
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
