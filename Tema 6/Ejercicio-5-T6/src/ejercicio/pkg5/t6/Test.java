package ejercicio.pkg5.t6;

/**
 *
 * @author antonio
 */
public class Test {
    public static void main(String[] args) {
        Ornitorrinco orn = new Ornitorrinco();
        orn.mostrarNumHuevos();
        orn.obtenerMensajeOviparo();
        orn.ponerHuevo();
        orn.incubarHuevo();
        orn.mostrarNumHuevos();
        
        Murcielago mur = new Murcielago();
        mur.mostrarAlturaVuelo();
        mur.obtenerMensajeVuelo();
        mur.aumentarAlturaVuelo();
        mur.bajarAlturaVuelo();
        mur.mostrarAlturaVuelo();

        System.out.println("\n\n");
        
        Oviparo ovi = new Ornitorrinco(6, "Perry", "Hembra", "Azul", 15);
        Volador vol = new Murcielago(10, "Batman", "Macho", "Negro", 2);
        
        System.out.println(ovi.obtenerMensajeOviparo());
        ovi.ponerHuevo();
        ovi.mostrarNumHuevos();

        System.out.println(vol.obtenerMensajeVuelo());
        vol.aumentarAlturaVuelo();
        vol.mostrarAlturaVuelo();
    }
    
}
