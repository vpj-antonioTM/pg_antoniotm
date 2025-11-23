package ejercicio.pkg24;

public class Ejercicio24 {
    
    public static void main(String[] args) {
        // Crear objeto de producto fresco
        ProductioFresco lechuga = new ProductioFresco(25, "Esapana", "22-11-2026", 5);
        
        // Crear objeto de producto refrigerado
        ProductoRefrigerado batido = new ProductoRefrigerado(6, "23-4-26", 8);
        
        // Crear objeto de producto congelado
        ProductoCongelado croqueta = new ProductoCongelado(54, "26-12-27", 34);
        
        // Mostrar los objetos en consola
        System.out.println(lechuga);
        System.out.println(batido);
        System.out.println(croqueta);
    }
    
}

