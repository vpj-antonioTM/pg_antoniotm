/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package sumanumerosprimos;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class SumaNumerosPrimosTest {
    
    public SumaNumerosPrimosTest() {
    }

    /**
     * Test of main method, of class SumaNumerosPrimos.
     */
    @Test
    public void testMain() {
        assertEquals(SumaNumerosPrimos.sumaPrimos(10), 17);
        assertEquals(SumaNumerosPrimos.sumaPrimos(12), 28);
    }
    
}
