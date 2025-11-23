package ejercicio.pkg03;

/**
 *
 * @author antonio
 */
public class Test {
    public static void main (String[] args) {
        Rueda rueda1 = new Rueda();
        Rueda rueda2 = new Rueda();
        
        rueda1.establecerMaterial("Acero");
        rueda1.establecerPulgadas(16);

        rueda2.establecerMaterial("Aluminio");
        rueda2.establecerPulgadas(18);
        
        System.out.println("Rueda 1 " + rueda1.obtenerMaterial() + " - " + rueda1.obtenerPulgadas() + " pulgadas");
        System.out.println("Rueda 2 " + rueda2.obtenerMaterial() + " - " + rueda2.obtenerPulgadas() + " pulgadas");
        
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();
        
        coche1.establecerMarca("Renault");
        coche1.establecerModelo("Megane");
        
        coche2.establecerMarca("Corvette");
        coche2.establecerModelo("C5");
        
        coche3.establecerMarca("Honda");
        coche3.establecerModelo("NSX");
        
        coche1.establecerRueda(rueda2);
        coche2.establecerRueda(rueda1);
        coche3.establecerRueda(rueda1);
        
        System.out.println("Coche 1: " + coche1.obtenerMarca() + " " + coche1.obtenerModelo() +
                           " - Rueda: " + coche1.obtenerRueda().obtenerMaterial() + " " +
                           coche1.obtenerRueda().obtenerPulgadas() + " pulgadas");

        System.out.println("Coche 2: " + coche2.obtenerMarca() + " " + coche2.obtenerModelo() +
                           " - Rueda: " + coche2.obtenerRueda().obtenerMaterial() + " " +
                           coche2.obtenerRueda().obtenerPulgadas() + " pulgadas");

        System.out.println("Coche 3: " + coche3.obtenerMarca() + " " + coche3.obtenerModelo() +
                           " - Rueda: " + coche3.obtenerRueda().obtenerMaterial() + " " +
                           coche3.obtenerRueda().obtenerPulgadas() + " pulgadas");
    }
}
