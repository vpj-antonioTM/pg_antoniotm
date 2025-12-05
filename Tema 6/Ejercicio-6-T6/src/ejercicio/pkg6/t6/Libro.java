package ejercicio.pkg6.t6;

/**
 *
 * @author alumno
 */
public class Libro implements Transformable {

    private String titulo;
    private String autor;
    private String genero;

    public Libro() {
        this.titulo = "0";
        this.autor = "0";
        this.genero = "0";
    }

    public Libro(String titulo, String autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + '}';
    }

    @Override
    public String concatenarTodo() {
        return titulo.toLowerCase() + " # " + autor.toLowerCase() + " # " + genero.toLowerCase();
    }

    @Override
    public String obtenerIniciales() {
        String resultado = "";
        if (!titulo.isEmpty()) {
            Character.toLowerCase(titulo.charAt(0));
        }
        if (!autor.isEmpty()) {
            Character.toLowerCase(autor.charAt(0));
        }
        if (!genero.isEmpty()) {
            Character.toLowerCase(genero.charAt(0));
        }
        return resultado;
    }

    @Override
    public int contarVocales() {
        return contar(titulo) + contar(autor) + contar(genero);
    }

    private int contar(String cad) {
        int c = 0;
        cad = cad.toLowerCase();
        for (int i = 0; i < cad.length(); i++) {
            if ("aeiou".indexOf(cad.charAt(i)) != -1) {
                c++;
            }
        }
        return c;
    }

    @Override
    public String obtenerCadenaMasLarga() {
        String mas = titulo;
        if (autor.length() > mas.length()) {
            mas = autor;
        }
        if (genero.length() > mas.length()) {
            mas = genero;
        }
        return mas.toLowerCase();
    }

    @Override
    public boolean buscarCadena(String cadena) {
        String buscada = cadena.toLowerCase();
        return titulo.toLowerCase().equals(buscada)
                || autor.toLowerCase().equals(buscada)
                || genero.toLowerCase().equals(buscada);
    }

}
