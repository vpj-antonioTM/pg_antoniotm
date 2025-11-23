package ejercicio.pkg24;

// Clase padre Producto
public class Producto {
    
    // Atributos: fecha de caducidad y número de lote
    private String fechaCad;
    private int numLote;

    // Constructor para inicializar los atributos
    public Producto(String fechaCad, int numLote) {
        this.fechaCad = fechaCad;
        this.numLote = numLote;
    }

    // Métodos getter y setter de fechaCad
    public String getFechaCad() {
        return fechaCad;
    }

    public void setFechaCad(String fechaCad) {
        this.fechaCad = fechaCad;
    }

    // Métodos getter y setter de numLote
    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    // Representación en texto del objeto
    @Override
    public String toString() {
        return "Producto{" + "fechaCad=" + fechaCad + ", numLote=" + numLote + '}';
    }
}

