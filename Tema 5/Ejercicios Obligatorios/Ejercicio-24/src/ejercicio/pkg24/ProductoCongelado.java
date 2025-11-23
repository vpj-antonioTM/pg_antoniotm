package ejercicio.pkg24;

// Clase hija que hereda de Producto
public class ProductoCongelado extends Producto {
    
    // Atributo propio: temperatura de conservación
    private int temp;
    
    // Constructor por defecto
    public ProductoCongelado() {
        super("0", 0);   // Inicializa atributos heredados
        this.temp = 0;
    }

    // Constructor con parámetros
    public ProductoCongelado(int temp, String fechaCad, int numLote) {
        super(fechaCad, numLote);  // Inicializa atributos heredados
        this.temp = temp;
    }

    // Getter y setter
    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    // Representación en texto del objeto
    @Override
    public String toString() {
        return super.toString() + "ProductoCongelado{" + "temp=" + temp + '}';
    }
}
