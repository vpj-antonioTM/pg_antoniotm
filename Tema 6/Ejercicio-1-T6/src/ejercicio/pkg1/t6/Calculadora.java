package ejercicio.pkg1.t6;

public abstract class Calculadora {
    protected double numero;

    // Constructor por defecto
    public Calculadora() {
        this.numero = 0;
    }

    // Constructor con parámetros
    public Calculadora(double numero) {
        this.numero = numero;
    }

    // Getter y Setter
    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    // Método abstracto
    public abstract void realizarOperacion();
}

