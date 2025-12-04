package ejercicio.pkg3.t6;

public class Circulo extends FiguraGeometrica {
    private double radio;
    //Constructor por defecto
    public Circulo() {
        super();
        this.radio = 0;
    }
    //Constructor parametrizado
    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }
    //Getter and Setter
    public double getRadio() { return radio; }
    public void setRadio(double radio) { this.radio = radio; }

    //Mostrar
    @Override
    public String toString() {
        return super.toString() + "Circulo{" + "radio=" + radio + '}';
    }
    //Metodo calcular Area
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    //Metodo calcular perimetro
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}