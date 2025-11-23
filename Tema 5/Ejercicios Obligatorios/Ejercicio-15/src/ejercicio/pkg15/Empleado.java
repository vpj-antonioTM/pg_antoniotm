package ejercicio.pkg15;

// Clase Empleado
class Empleado {
    private final String nombre;
    private final int salario;
    private final Direccion direccion;

    // Constructor
    public Empleado(String nombre, int salario, Direccion direccion) {
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = direccion;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getSalario() {
        return salario;
    }

    public Direccion getDireccion() {
        return direccion;
    }
    
    // Método para mostrar datos del empleado
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Direccion:");
        direccion.mostrarDireccion();
        System.out.println("-------------------------");
    }
}
