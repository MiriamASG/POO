package menu;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author miria
 */
public class Ejercicio6 {
    
     public Ejercicio6(){
     ejercicio6();
 } 
     public void ejercicio6 (){
    System.out.println("Ingrese el radio: ");
    Scanner miscanner= new Scanner(System.in);
    float radio=miscanner.nextFloat();
    System.out.println("La superficie de la esfera es: "+ calcularSuperficie(radio));
    System.out.println("El volumen de la esfera es: "+ calcularVolumen(radio));
    }
    
    public float calcularSuperficie(float radio){
    return ((float) (4*Math.PI*Math.pow(radio, 2)));
    }
    public float calcularVolumen(float radio){
    return ((float) (4*Math.PI*Math.pow(radio, 3)/3));
     }
}
