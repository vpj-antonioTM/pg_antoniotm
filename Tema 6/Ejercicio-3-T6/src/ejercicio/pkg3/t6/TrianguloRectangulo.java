package ejercicio.pkg3.t6;

public class TrianguloRectangulo extends Triangulo {

    public TrianguloRectangulo() {
        super();
    }

    public TrianguloRectangulo(String color, double base, double altura) {
        super(color, base, altura);
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }

    public double calcularHipotenusa() {
        return Math.sqrt(base * base + altura * altura);
    }

    public String tipoTriangulo() {
        if (base == altura && altura == calcularHipotenusa()) {
            return "Equilatero";
        } else if (base == altura || base == calcularHipotenusa() || altura == calcularHipotenusa()) {
            return "Isosceles";
        } else {
            return "Escaleno";
        }
    }
}

