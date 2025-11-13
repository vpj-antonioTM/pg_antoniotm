package ejercicio.pkg03;

/**
 *
 * @author antonio
 */
public class Rueda {
    private String material;
    private int pulgadas;
    
    public void material (String establecerMaterial) {
        material = establecerMaterial;
    }
    public void pulgadas (int establecerPulgadas) {
        pulgadas = establecerPulgadas;
    }
    public String obtenerMaterial () {
        return material;
    }
    public int obtenerPulgadas () {
        return pulgadas;
    }

    void establecerMaterial(String acero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void establecerPulgadas(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
