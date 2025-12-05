/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author antonio
 */
public class Test {
    public static void main(String[] args) {
        Televisor tv = new Televisor();
        tv.encender();
        tv.apagar();
        tv.bajarVolumen();
        tv.subirVolumen();
        tv.subirVolumen();
        tv.subirVolumen();
        System.out.println("El volumen aumento en 3");
        tv.cambiarCanal(5);
        tv.mostrarInfo();
        
        
        Radio rd = new Radio();
        rd.encender();
        rd.apagar();
        rd.bajarVolumen();
        rd.subirVolumen();
        rd.subirVolumen();
        rd.subirVolumen();
        System.out.println("El volumen aumento en 3");
        rd.cambiarCanal(75.5f);
        rd.mostrarInfo();
    }
}
