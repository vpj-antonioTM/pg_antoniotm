package ejercicio.pkg15;

// Clase Dirección
class Direccion {
    private final String calle;
    private final int numero;
    private final int piso;
    private final String ciudad;

    // Constructor por defecto
    public Direccion(String calle, int numero, int piso, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.ciudad = ciudad;
    }

    // Método para mostrar la dirección
    public void mostrarDireccion() {
        System.out.println("Calle: " + calle);
        System.out.println("Numero: " + numero);
        System.out.println("Piso: " + piso);
        System.out.println("Ciudad: " + ciudad);
    }
}

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

    // Método para mostrar datos del empleado
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Direccion:");
        direccion.mostrarDireccion();
        System.out.println("-------------------------");
    }
}

// Clase Test
public class Test {
    public static void main(String[] args) {
        // Creamos 3 direcciones
        Direccion d1 = new Direccion("Avenida Espana", 12, 3, "Plasencia");
        Direccion d2 = new Direccion("Calle Mayor", 45, 1, "Caceres");
        Direccion d3 = new Direccion("Plaza Espana", 100, 7, "Madrid");

        // Creamos 3 empleados con esas direcciones
        Empleado e1 = new Empleado("Juan Perez", 1500, d1);
        Empleado e2 = new Empleado("Maria Lopez", 1800, d2);
        Empleado e3 = new Empleado("Carlos Sanchez", 2000, d3);

        // Mostramos los datos de cada empleado
        System.out.println("EMPLEADO 1:");
        e1.mostrarDatos();

        System.out.println("EMPLEADO 2:");
        e2.mostrarDatos();

        System.out.println("EMPLEADO 3:");
        e3.mostrarDatos();
    }
}