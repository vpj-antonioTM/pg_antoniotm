package ejercicio.pkg3.t6;

public abstract class FiguraGeometrica {
    protected String color;

    public FiguraGeometrica() {
        this.color = "Sin color";
    }

    public FiguraGeometrica(String color) {
        this.color = color;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}