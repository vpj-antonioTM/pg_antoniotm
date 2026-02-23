/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ordenarporseleccion;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class OrdenarPorSeleccionTest {

    public OrdenarPorSeleccionTest() {
    }

    /**
     * Test of main method, of class OrdenarPorSeleccion.
     */
    @Test
    public void TestOrdenacionNumerosCajaNegra() {
        System.out.println("Orden por Seleccion CajaNegra");
        OrdenarPorSeleccion instance = new OrdenarPorSeleccion();

        int numeros[] = {4, 3, 6, 8, 2, 9, 1, 5, 7};
        assertEquals(false, instance.ordenarPorSeleccion(numeros));

        int ordenados[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(true, instance.ordenarPorSeleccion(ordenados));
    }
    @Test
    public void TestOrdenacionNumerosCajaBlanca() {
        System.out.println("Orden por Seleccion CajaBlanca");
        OrdenarPorSeleccion instance = new OrdenarPorSeleccion();

        int numeros[] = {4, 3,2,1};
        assertEquals(false, instance.ordenarPorSeleccion(numeros));

        int ordenados[] = {1, 2, 3, 4};
        assertEquals(true, instance.ordenarPorSeleccion(ordenados));
    }
}
