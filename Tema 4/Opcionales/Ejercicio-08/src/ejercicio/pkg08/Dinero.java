package ejercicio.pkg08;

/**
 * Ejercicio-08
 * @author antonio
 */
public class Dinero {
    public static void dividirDinero (int euros){
        System.out.println(euros + " Euros se descomponen en:");

        // Billetes de 50
        int billetes50 = euros / 50;
        euros = euros % 50;
        if (billetes50 > 0) {
            System.out.println("Billetes de 50: " + billetes50);
        }

        // Billetes de 20
        int billetes20 = euros / 20;
        euros = euros % 20;
        if (billetes20 > 0) {
            System.out.println("Billetes de 20: " + billetes20);
        }

        // Billetes de 10
        int billetes10 = euros / 10;
        euros = euros % 10;
        if (billetes10 > 0) {
            System.out.println("Billetes de 10: " + billetes10);
        }

        // Billetes de 5
        int billetes5 = euros / 5;
        euros = euros % 5;
        if (billetes5 > 0) {
            System.out.println("Billetes de 5: " + billetes5);
        }

        // Monedas de 2
        int monedas2 = euros / 2;
        euros = euros % 2;
        if (monedas2 > 0) {
            System.out.println("Monedas de 2 euros: " + monedas2);
        }

        // Monedas de 1
        if (euros > 0) {
            System.out.println("Monedas de 1 euro: " + euros);
        }
    }
}