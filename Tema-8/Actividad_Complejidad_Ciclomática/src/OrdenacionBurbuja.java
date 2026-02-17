public class OrdenacionBurbuja {

    public boolean burbuja(int[] arrayNumeros) {
        boolean ordenado = true;
        int elementoActual, elementoSiguiente;

        for (int x = 0; x < arrayNumeros.length; x++) {
            for (int y = 0; y < arrayNumeros.length - 1; y++) {
                elementoActual = arrayNumeros[y];
                elementoSiguiente = arrayNumeros[y + 1];

                if (elementoActual > elementoSiguiente) {
                    arrayNumeros[y] = elementoSiguiente;
                    arrayNumeros[y + 1] = elementoActual;
                    ordenado = false;
                }
            }
        }

        return ordenado;
    }
}



