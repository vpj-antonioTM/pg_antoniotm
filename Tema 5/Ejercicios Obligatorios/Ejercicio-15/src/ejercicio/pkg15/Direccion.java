package ejercicio.pkg15;

// Clase Dirección
class Direccion {
    private final String calle;
    private final int numero;
    private final int piso;
    private final String ciudad;

    //Constructor por defecto
    public Direccion() {
        this.calle = "0";
        this.numero = 0;
        this.piso = 0;
        this.ciudad = "0";
    }
    
    
    // Constructor
    public Direccion(String calle, int numero, int piso, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.ciudad = ciudad;
    }
    
    //Getters
    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public int getPiso() {
        return piso;
    }

    public String getCiudad() {
        return ciudad;
    }

    // Método para mostrar la dirección
    public void mostrarDireccion() {
        System.out.println("Calle: " + calle);
        System.out.println("Numero: " + numero);
        System.out.println("Piso: " + piso);
        System.out.println("Ciudad: " + ciudad);
    }
}