package ejermplotema5;
public class EjermploTema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Bicicleta bici1 = new Bicicleta ();
            bici1.setMarca ("Orbea");
            bici1.setColor("Azul");
            bici1.setTipo("Montaña");
            bici1.setAntiguedad (6);
            bici1.mostrarBicicleta();
            
             System.out.println(" ");
            
            Bicicleta bici2 = new Bicicleta ();
            bici2.setMarca ("Canodale");
            bici2.setColor("Roja");
            bici2.setTipo("Carretera");
            bici2.setAntiguedad (15);
            bici2.mostrarBicicleta();
            
            System.out.println(" ");
            
            bici1.mostrarAntiguedad();
            bici2.mostrarAntiguedad();
    }
    
}
