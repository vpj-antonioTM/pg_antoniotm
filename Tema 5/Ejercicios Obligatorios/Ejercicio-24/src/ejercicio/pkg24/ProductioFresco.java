package ejercicio.pkg24;

// Clase hija que hereda de Producto
public class ProductioFresco extends Producto {

    // Atributos propios de productos frescos
    private int fechaEnv;       // Fecha de envasado
    private String paisOrigen;  // País de origen

    // Constructor por defecto
    public ProductioFresco() {
        super("0", 0);          // Llama al constructor de Producto
        this.fechaEnv = 0;
        this.paisOrigen = "0";
    }
    
    // Constructor con parámetros
    public ProductioFresco(int fechaEnv, String paisorig, String fechaCad, int numLote) {
        super(fechaCad, numLote);   // Inicializa atributos heredados
        this.fechaEnv = fechaEnv;
        this.paisOrigen = paisorig;
    }

    // Getters y setters
    public int getFechaEnv() {
        return fechaEnv;
    }

    public void setFechaEnv(int fechaEnv) {
        this.fechaEnv = fechaEnv;
    }

    public String getPaisorig() {
        return paisOrigen;
    }

    public void setPaisorig(String paisorig) {
        this.paisOrigen = paisorig;
    }

    // Representación en texto del objeto
    @Override
    public String toString() {
        return super.toString() + "ProductioFresco{" + "fechaEnv=" + fechaEnv + ", paisorig=" + paisOrigen + '}';
    }
}
