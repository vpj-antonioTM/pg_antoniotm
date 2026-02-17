import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class OrdenacionBurbujaCajaBlancaTest {

    OrdenacionBurbuja ob = new OrdenacionBurbuja();

    @Test
    public void camino1_ArrayVacio() {
        int[] datos = {};
        assertTrue(ob.burbuja(datos));
    }

    @Test
    public void camino2_ArrayOrdenado() {
        int[] datos = {1, 2, 3};
        assertTrue(ob.burbuja(datos));
    }

    @Test
    public void camino3_ArrayMuyDesordenado() {
        int[] datos = {5, 1, 0};
        assertFalse(ob.burbuja(datos));
    }

    @Test
    public void camino4_ArrayParcialmenteDesordenado() {
        int[] datos = {1, 3, 2};
        assertFalse(ob.burbuja(datos));
    }
}




