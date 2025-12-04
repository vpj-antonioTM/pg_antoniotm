package ejercicio.pkg1.t6;

public class Test {
    public static void main(String[] args) {
        // Usando constructores por defecto y setters
        System.out.println("Usando constructores por defecto");
        
        Suma suma = new Suma();
        suma.setNumero(10);
        suma.setSumando(5);

        Multiplicacion multiplicacion = new Multiplicacion();
        multiplicacion.setNumero(10);
        multiplicacion.setMultiplicador(3);

        Potencia potencia = new Potencia();
        potencia.setNumero(2);
        potencia.setExponente(4);

        suma.realizarOperacion();
        multiplicacion.realizarOperacion();
        potencia.realizarOperacion();

        System.out.println("\nUsando constructores con parametros");

        // Usando constructores con parámetros
        Suma suma2 = new Suma(20, 7);
        Multiplicacion multiplicacion2 = new Multiplicacion(5, 6);
        Potencia potencia2 = new Potencia(3, 3);

        suma2.realizarOperacion();
        multiplicacion2.realizarOperacion();
        potencia2.realizarOperacion();

        System.out.println("\nUsando polimorfismo");

        // Polimorfismo
        Calculadora calc1 = new Suma(15, 10);
        Calculadora calc2 = new Multiplicacion(4, 8);
        Calculadora calc3 = new Potencia(5, 2);

        calc1.realizarOperacion();
        calc2.realizarOperacion();
        calc3.realizarOperacion();
    }
}

