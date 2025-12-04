package ejercicio.pkg3.t6;

public abstract class FiguraGeometrica {
    private String color;

    //Constructor por defecto
    public FiguraGeometrica() {
        this.color = "Sin color";
    }
    //Constructor parametrizado
    public FiguraGeometrica(String color) {
        this.color = color;
    }
    //Getters and Setters
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    //Metodos Abstractos
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    //Mostrar
    @Override
    public String toString() {
        return "FiguraGeometrica{" + "color=" + color + '}';
    }
    
    
}