
package ejercicio.pkg13;

class Saludo {
    private String frase;
    
    //Constructor que almacena frase
    public Saludo (String frase) {
        this.frase = frase;
    }
    
    //Getter para devolver frase
    public String getFrase(){
        return frase;
    }
    
    //Metodo para mostrar 1 vez
    public void mostrarUno() {
        System.out.println(frase);
    }
    
    //Metodo con bucle for para mostrar 5 veces
    public void mostrarCinco (int veces){
        for (int i = 1; i <= 5; i++) {
        System.out.println(i + " " + frase);
    }
  }
}
public class Test {
        public static void main(String[] args) {
        //Creamos el objeto saludo
        Saludo hola = new Saludo("Hola que tal");
        
        //Lo mostramos
        hola.mostrarCinco(5);
    }
}
