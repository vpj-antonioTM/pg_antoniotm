import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio27 {
    
    /**
     * @author Antonio
     * Ejercico-27
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        int opcion = 0;

        try {
            // Le pedimos los dos numeros al usuario
            System.out.print("Por favor, introduce el primer numero: ");
            num1 = sc.nextInt();

            System.out.print("Por favor, introduce el segundo numero: ");
            num2 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("!ERROR¡ Debes introducir un numero valido.");
            return; // Le da error al usuario si ha introducido un caracter no valido
        }

        // Bucle do while, do para las opciones de operaciones, while que recoga las opciones del 1 al 5
        do {
            System.out.println("OPERACIONES");
            System.out.println("1. Sumar los numeros");
            System.out.println("2. Restar los numeros");
            System.out.println("3. Multiplicar los numeros");
            System.out.println("4. Dividir los numeros");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion (1-5): ");

            try {
                opcion = sc.nextInt(); //Pedimos al usuario que eliga una opcion de las 5

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado de la suma: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Resultado de la resta: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Resultado de la multiplicacion: " + (num1 * num2));
                        break;
                    case 4:
                        try {
                            if (num2 == 0) {
                                throw new ArithmeticException("Division por cero");
                            }
                            System.out.println("Resultado de la division: " + (num1 / num2));
                        } catch (ArithmeticException e) {
                            System.out.println("!ERROR¡ No se puede dividir entre 0.");
                        }
                        break;
                    case 5:
                        System.out.println("Saliendo del programa., hasta pronto.");
                        break;
                    default:
                        System.out.println(" Opcion no valida. Intentalo de nuevo.");
                }

            } catch (InputMismatchException e) {
                System.out.println("!ERROR¡ Debes introducir un numero del 1 al 5.");
                sc.next(); // Le salta un error al usuario si introduce un numero menor de 0 y mayor de 5
            }
        } while (opcion != 5);
    }
}