package ejercicio.pkg24;

// Clase hija que hereda de Producto
public class ProductoRefrigerado extends Producto {
    
    // Atributo propio: código del organismo de supervisión
    private int codOrg;
    
    // Constructor por defecto
    public ProductoRefrigerado() {
        super("0", 0);   // Inicializa atributos heredados
        this.codOrg = 0;
    }

    // Constructor con parámetros
    public ProductoRefrigerado(int codOrg, String fechaCad, int fechaLot) {
        super(fechaCad, fechaLot);  // Inicializa atributos heredados
        this.codOrg = codOrg;
    }

    // Getter y setter
    public int getCodOrg() {
        return codOrg;
    }

    public void setCodOrg(int codOrg) {
        this.codOrg = codOrg;
    }

    // Representación en texto del objeto
    @Override
    public String toString() {
        return super.toString() + "ProductoRefrigerado{" + "codOrg=" + codOrg + '}';
    }
}
