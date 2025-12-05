package ejercicio.pkg5.t6;

/**
 *
 * @author antonio
 */
public class Mamifero {
    private String nombre;
    private String sexo;
    private String color;
    private int edad;

        public Mamifero() {
        this.nombre = "0";
        this.sexo = "0";
        this.color = "0";
        this.edad = 0;
    }
    
    public Mamifero(String nombre, String sexo, String color, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.color = color;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Mamifero{" + "nombre=" + nombre + ", sexo=" + sexo + ", color=" + color + ", edad=" + edad + '}';
    }
}
