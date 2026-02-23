/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ordenacionburbuja;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class OrdenacionBurbujaTest {
    
    public OrdenacionBurbujaTest() {
    }

    /**
     * Test of burbuja method, of class OrdenacionBurbuja.
     */
    @Test
    public void testBurbuja() {
        System.out.println("Metodo Burbuja");
        OrdenacionBurbuja instance = new OrdenacionBurbuja();
        
        int numeros[] = {2,3,6,4,7,9};
        assertEquals(false ,instance.burbuja(numeros));
        
        int ordenados[] = {1,3,4,6,7,9};
        assertEquals(true, instance.burbuja(ordenados));
    }
    
}
