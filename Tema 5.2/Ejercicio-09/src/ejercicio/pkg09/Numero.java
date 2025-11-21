package ejercicio.pkg09;

import java.util.Scanner;

// Clase pública Numero
public class Numero {
    // Atributo privado
    private int valor;

    // Constructor
    public Numero(int v) {
        valor = v;
    }

    // Getter
    public int getValor() {
        return valor;
    }

    // Setter
    public void setValor(int nuevoValor) {
        valor = nuevoValor;
    }
}

// Clase TestMayor para probar Numero
class Test {
    // Método para obtener el mayor de tres números
    public static int mayorDeTres(Numero n1, Numero n2, Numero n3) {
        int mayor = n1.getValor(); // asumimos que n1 es mayor al inicio

        if (n2.getValor() > mayor) {
            mayor = n2.getValor();
        }

        if (n3.getValor() > mayor) {
            mayor = n3.getValor();
        }

        return mayor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leemos tres números
        System.out.print("Introduce el primer número: ");
        Numero num1 = new Numero(sc.nextInt());

        System.out.print("Introduce el segundo número: ");
        Numero num2 = new Numero(sc.nextInt());

        System.out.print("Introduce el tercer número: ");
        Numero num3 = new Numero(sc.nextInt());

        // Calculamos el mayor
        int mayor = mayorDeTres(num1, num2, num3);

        // Mostramos el resultado
        System.out.println("El número mayor es: " + mayor);

        sc.close();
    }
}

