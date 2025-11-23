package ejercicio.pkg02;

/**
 *
 * @author antonio
 */
public class Test {
    public static void main(String[] args) {
        //Creamos los objetos de Curso
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        //Establecemos el nombre y las horas de los cursos
        curso1.establecerNombreyHoras("Programación en Java", 40);
        curso2.establecerNombreyHoras("Bases de Datos", 30);

        //Para que nos muestre el resultado de Cursos
        System.out.println("Curso 1: " + curso1.obtenerNombre() + " - " + curso1.obtenerHoras() + " horas");
        System.out.println("Curso 2: " + curso2.obtenerNombre() + " - " + curso2.obtenerHoras() + " horas");

        //Para que noes muestre el resultado del contador
        System.out.println("Número de cursos creados: " + Curso.verNumeroCursos());
    }
}
