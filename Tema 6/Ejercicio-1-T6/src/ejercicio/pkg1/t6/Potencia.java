package ejercicio.pkg1.t6;

public class Potencia extends Calculadora {
    private int exponente;

    // Constructor por defecto
    public Potencia() {
        super();
        this.exponente = 1;
    }

    // Constructor con parámetros
    public Potencia(double numero, int exponente) {
        super(numero);
        this.exponente = exponente;
    }

    // Getters y Setters
    public int getExponente() {
        return exponente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }

    @Override
    public void realizarOperacion() {
        double resultado = Math.pow(numero, exponente);
        System.out.println("Resultado de la potencia: " + resultado);
    }
}
