package ejercicio.pkg15;

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