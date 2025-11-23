package ejercicio.pkg08;

/**
 *
 * @author antonio
 */
import java.util.Scanner;

// Clase pública Numero
public class Numero {
    // Atributo privado
    private int valor;

    // Constructor
    public Numero(int v) {
        valor = v; // no usamos 'this'
    }

    // Getter
    public int getValor() {
        return valor;
    }

    // Setter
    public void setValor(int nuevoValor) {
        valor = nuevoValor;
    }

    // Método para determinar si es par
    public boolean esPar() {
        return valor % 2 == 0;
    }
}

// Clase Test para probar Numero
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario un número
        System.out.print("Introduce un numero entero: ");
        int numeroUsuario = sc.nextInt();

        // Creamos el objeto Numero
        Numero numero = new Numero(numeroUsuario);

        // Llamamos al método que determina si es par o impar
        if (numero.esPar()) {
            System.out.println("El numero " + numero.getValor() + " es par.");
        } else {
            System.out.println("El numero " + numero.getValor() + " es impar.");
        }

        sc.close();
    }
}

