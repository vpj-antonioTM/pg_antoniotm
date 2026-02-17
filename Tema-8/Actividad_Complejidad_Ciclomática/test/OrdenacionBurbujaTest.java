import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class OrdenacionBurbujaTest {

    OrdenacionBurbuja ob = new OrdenacionBurbuja();

    @Test
    public void testArrayOrdenado() {
        int[] datos = {1, 2, 3};
        assertTrue(ob.burbuja(datos));
    }

    @Test
    public void testArrayDesordenado() {
        int[] datos = {3, 2, 1};
        assertFalse(ob.burbuja(datos));
    }

    @Test
    public void testElementosIguales() {
        int[] datos = {2, 2, 2};
        assertTrue(ob.burbuja(datos));
    }

    @Test
    public void testUnElemento() {
        int[] datos = {5};
        assertTrue(ob.burbuja(datos));
    }

    @Test
    public void testArrayVacio() {
        int[] datos = {};
        assertTrue(ob.burbuja(datos));
    }
}


