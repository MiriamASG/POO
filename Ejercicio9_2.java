package menu;

/**
 *
 * @author miria
 */
public class Ejercicio9_2 {
    
    class Persona{
    public String nombre;
    public String apellido;
    public int edad;
    public String genero;
    public Persona(String nombres,String apellidos, int edades, String generos){
        this.nombre = nombres;
        this.apellido = apellidos;
        this.edad = edades;
        this.genero = generos;
    }
    public void datos(){
        System.out.println("DATOS PERSONA");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
        System.out.println("Genero: "+genero);
        System.out.println("-----------------------");
    }
    public void caminar(){
        System.out.println(nombre+" caminó bastante hoy.");
    }
    public void hablar(){
        System.out.println(nombre+" está hablando con su madre...");
    }
    public void correr(){
        System.out.println(nombre+" inició a correr.");
    }
}

public class Main{
    public  void main(String[] args) {
    Persona persona1 = new Persona("Miriam","Stampanone",27,"F");
    persona1.datos();
    persona1.caminar();
    persona1.hablar();
    persona1.correr();
    }
}
    
}
