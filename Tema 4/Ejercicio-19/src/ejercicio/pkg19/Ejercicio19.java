package ejercicio.pkg19;

import java.util.Scanner;

public class Ejercicio19 {

    /**
     * @author Antonio
     * Ejercicio-19
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Introduzca un dia de la semana: ");
        String diaSemana = entrada.nextLine();
        
        switch(diaSemana){
             case "Lunes":
                System.out.println("Lunes es el primer dia de la semana");
                break;
            case "Martes":
                System.out.println("Martes es el segundo dia de la semana");
                break;
            case "Miercoles":
                System.out.println("Miercoles es el tercer dia de la semana");
                break;
             case "Jueves":
                System.out.println("Jueves es el cuarto dia de la semana");
                break;
             case "Viernes":
                System.out.println("Viernes es el quinto dia de la semana");
                break;
             case "Sabado":
                System.out.println("Sabado es el sexto dia de la semana");
                break;
             case "Domingo":
                System.out.println("Domingo es el septimo dia de la semana");
                break;
        }
    }
}
