package ejercicio.pkg1.t6;

public class Suma extends Calculadora {
    private double sumando;

    // Constructor por defecto
    public Suma() {
        super();
        this.sumando = 0;
    }

    // Constructor con parámetros
    public Suma(double numero, double sumando) {
        super(numero);
        this.sumando = sumando;
    }

    // Getters y Setters
    public double getSumando() {
        return sumando;
    }

    public void setSumando(double sumando) {
        this.sumando = sumando;
    }

    @Override
    public void realizarOperacion() {
        double resultado = numero + sumando;
        System.out.println("Resultado de la suma: " + resultado);
    }
}
