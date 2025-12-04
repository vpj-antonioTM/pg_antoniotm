package ejercicio.pkg3.t6;

public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo() {
        super();
        this.radio = 0;
    }

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    public double getRadio() { return radio; }
    public void setRadio(double radio) { this.radio = radio; }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}