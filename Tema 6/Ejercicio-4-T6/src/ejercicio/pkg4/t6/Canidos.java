package ejercicio.pkg4.t6;

public class Canidos extends Animal{
    
    private String Sonido;
    private String alimentacion;
    private String habitat;
    private String nombreCientifico;

    public Canidos(String Sonido, String alimentacion, String habitat, String nombreCientifico, String nombre, int edad, float peso) {
        super(nombre, edad, peso);
        this.Sonido = Sonido;
        this.alimentacion = alimentacion;
        this.habitat = habitat;
        this.nombreCientifico = nombreCientifico;
    }

    public String getSonido() {
        return Sonido;
    }

    public void setSonido(String Sonido) {
        this.Sonido = Sonido;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    @Override
    public void mostrarSonido() {
        System.out.println("Sonido: "+ this.Sonido);
    }
    
    @Override
    public void alimentacion() {
        System.out.println("Alimmentacion: " + this.alimentacion);
    }

    @Override
    public void habitat() {
        System.out.println("Habitat: " + this.habitat);
    }

    @Override
    public void nombreCientifico() {
        System.out.println("Nombre Cientifico: " + this.nombreCientifico);
    }
    
}
