package ejercicio.pkg3.t6;

public abstract class Triangulo extends FiguraGeometrica {
    protected double base;
    protected double altura;

    //Constructor por defecto
    public Triangulo() {
        super();
        this.base = 0;
        this.altura = 0;
    }

    //Constructor parametrizado
    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    //Getter and Setter
    public double getBase() { return base; }
    public double getAltura() { return altura; }
    public void setBase(double base) { this.base = base; }
    public void setAltura(double altura) { this.altura = altura; }

    //Calcular Area Triangulo
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return super.toString() +  "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
}