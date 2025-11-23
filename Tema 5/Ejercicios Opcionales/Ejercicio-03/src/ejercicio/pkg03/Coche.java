package ejercicio.pkg03;

/**
 *
 * @author antonio
 */
public class Coche {
    private String marca;
    private String modelo;
    private Rueda ruedas;


public void establecerMarca (String nuevaMarca) {
    marca = nuevaMarca;
}

public void establecerModelo (String nuevoModelo) {
    modelo = nuevoModelo;
}

public String obtenerMarca () {
    return marca;
}

public String obtenerModelo () {
    return modelo;
}

public void establecerRueda (Rueda nuevaRueda) {
    ruedas = nuevaRueda;
}

public Rueda obtenerRueda () {
    return ruedas;
}
}
