package ejercicio.pkg1.t6;

public class Multiplicacion extends Calculadora {
    private double multiplicador;

    // Constructor por defecto
    public Multiplicacion() {
        super();
        this.multiplicador = 1;
    }

    // Constructor con parámetros
    public Multiplicacion(double numero, double multiplicador) {
        super(numero);
        this.multiplicador = multiplicador;
    }

    // Getters y Setters
    public double getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    @Override
    public void realizarOperacion() {
        double resultado = numero * multiplicador;
        System.out.println("Resultado de la multiplicacion: " + resultado);
    }
}
