package ejercicio.pkg19;

public class Empleado {
    //Atributos
    private String nombre;
    private int horasTrabajo;
    private float tarifaHora;
    private boolean horasExtra;

    //Constructor por defecto
    public Empleado() {
        this.nombre = "0";
        this.horasTrabajo = 0;
        this.tarifaHora = 0;
        this.horasExtra = false;
    }
    
    // Constructor
    public Empleado(String nombre, int horasTrabajo, float tarifaHora) {
        this.nombre = nombre;
        this.horasTrabajo = horasTrabajo;
        this.tarifaHora = tarifaHora;
        this.horasExtra = horasTrabajo > 40;
    }

    //Getter y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    public float getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(float tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public boolean isHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(boolean horasExtra) {
        this.horasExtra = horasExtra;
    }
    
    // Método para calcular el dinero
    public float calcularDinero() {
        if (horasExtra) {
            int horasE = horasTrabajo - 40;
            float horaNormal = 40 * tarifaHora;
            float horaExtra = horasE * tarifaHora * 1.5f;
            return horaNormal + horaExtra;
        } else {
            return horasTrabajo * tarifaHora;
        }
    }

    // Muestra la información
    public void informacion() {
        System.out.println(nombre + " trabajo " + horasTrabajo + " horas y cobra " + tarifaHora + " euros/hora");
        if (horasExtra) {
            System.out.println("Por las horas extra recibira un total de " + calcularDinero());
        } else {
            System.out.println("No tiene horas extra, recibira un total de " + calcularDinero());
        }
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", horasTrabajo=" + horasTrabajo + ", tarifaHora=" + tarifaHora + ", horasExtra=" + horasExtra + '}';
    }
    
}