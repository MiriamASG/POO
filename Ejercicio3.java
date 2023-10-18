package menu;
import java.util.Scanner;

/**
 *
 * @author miria
 */
public class Ejercicio3 {
    
    public Ejercicio3(){
     ejercicio3();
 } 
     public void ejercicio3 () {
        Scanner lectura = new Scanner(System.in);
        int cont=2;
        int numero;
        int sumando1=0;
        int sumando2=1;
        int suma;
        
        System.out.println("Escriba la cantidad de numeros que quiere ver: ");
        numero=lectura.nextInt();
        
        System.out.print(sumando1 + " - " + sumando2 );
        
        while (cont<numero){
            suma=sumando1+sumando2;
            System.out.print(" - " + suma);
            sumando1=sumando2;
            sumando2=suma;
            cont++;
        }    
    }
    
}
