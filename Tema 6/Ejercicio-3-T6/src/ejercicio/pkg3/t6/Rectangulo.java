package ejercicio.pkg3.t6;

/**
 *
 * @author antonio
 */
public class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo() {
        super();
        this.base = 0;
        this.altura = 0;
    }

    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() { return base; }
    public double getAltura() { return altura; }
    public void setBase(double base) { this.base = base; }
    public void setAltura(double altura) { this.altura = altura; }

    //Mostrar
    @Override
    public String toString() {
        return super.toString() + "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    //Calcular Area
    @Override
    public double calcularArea() {
        return base * altura;
    }

    //Calcular Perimetro
    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}

