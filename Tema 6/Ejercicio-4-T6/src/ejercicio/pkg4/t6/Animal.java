package ejercicio.pkg4.t6;


public abstract class  Animal {
    private String nombre;
    private int edad;
    private double peso;

    
    // Constructor por defecto
    public Animal() {
        this.nombre = "Desconocido";
        this.edad = 0;
        this.peso = 0.0;
    }

    // Constructor parametrizado
    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    //Metodos abstractos
    public abstract void mostrarSonido();
    public abstract void mostrarAlimentacion();
    public abstract void mostrarHabitat();
    public abstract void mostrarNombreCientifico();

    public void mostrarDatos() {
        System.out.println(this.toString());
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + '}';
    }
}
