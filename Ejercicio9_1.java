package menu;

/**
 *
 * @author miria
 */
public class Ejercicio9_1 {
    
    class Perro{
    public String nombre;
    public int edad;
    public String raza;
    public String color;
    
    public Perro (String nombres, int edades, String razas, String colores){
        this.nombre = nombres;
        this.edad = edades;
        this.raza = razas;
        this.color = colores;
    }
    public void datos(){
        System.out.println("DATOS DEL PERRO");
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Raza: "+raza);
        System.out.println("Color: "+color);
        System.out.println("-------------------------");
    }
    public void ladrar(){
        System.out.println("El perro "+nombre+" ladró");
    }
    public void caminar(){
        System.out.println("El perro "+nombre+" caminó");
    }
    public void comer(){
        System.out.println("El perro "+nombre+" acaba de comer un poco");
    }
}

public class Main{
    public  void main(String[] args) {
        Perro perro1 = new Perro("Cleopatra",7,"Cruza Pastor Aleman y Siberiano","Negro y Rubio");
        perro1.datos();
        perro1.ladrar();
        perro1.caminar();
        perro1.comer();
    }
}
    
}
