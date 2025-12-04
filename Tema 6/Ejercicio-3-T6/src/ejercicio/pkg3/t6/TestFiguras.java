package ejercicio.pkg3.t6;

public class TestFiguras {
    public static void main(String[] args) {
        Circulo c = new Circulo("Rojo", 5);
        Rectangulo r = new Rectangulo("Azul", 4, 6);
        Cuadrado q = new Cuadrado("Verde", 3);
        TrianguloRectangulo t = new TrianguloRectangulo("Amarillo", 3, 4);

        System.out.println("Circulo - Area: " + c.calcularArea() + ", Perimetro: " + c.calcularPerimetro());
        System.out.println("Rectangulo - Area: " + r.calcularArea() + ", Perimetro: " + r.calcularPerimetro());
        System.out.println("Cuadrado - Area: " + q.calcularArea() + ", Perimetro: " + q.calcularPerimetro());
        System.out.println("Triangulo Rectangulo - Area: " + t.calcularArea() + ", Perimetro: " + t.calcularPerimetro());
        System.out.println("Hipotenusa: " + t.calcularHipotenusa());
        System.out.println("Tipo de triangulo: " + t.tipoTriangulo());

        System.out.println("\nUsando polimorfismo");

        FiguraGeometrica f1 = new Circulo("Negro", 2.5);
        FiguraGeometrica f2 = new Rectangulo("Gris", 7, 3);
        FiguraGeometrica f3 = new Cuadrado("Blanco", 4);
        FiguraGeometrica f4 = new TrianguloRectangulo("Naranja", 6, 8);

        System.out.println("Area f1: " + f1.calcularArea());
        System.out.println("Area f2: " + f2.calcularArea());
        System.out.println("Area f3: " + f3.calcularArea());
        System.out.println("Area f4: " + f4.calcularArea());
    }
}

