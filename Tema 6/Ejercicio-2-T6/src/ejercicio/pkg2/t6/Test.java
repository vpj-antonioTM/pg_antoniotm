package ejercicio.pkg2.t6;

public class Test {
        public static void main(String[] args) {
            
            //Revisar fallo en la muestra del ejercicio
            
        Profesor profesor = new Profesor("Dani", "Programacion");
        Alumno alumno = new Alumno("Antonio", "1ºDAM");

        System.out.println(profesor.saludar());
        System.out.println(alumno.saludar());

        Persona persona1 = new Profesor("Antonio", "LMSGI");
        Persona persona2 = new Alumno("Juan", "1ºDAM");

        System.out.println(persona1.saludar());
        System.out.println(persona2.saludar());
    }
}
