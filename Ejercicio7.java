package menu;
import java.util.Scanner;

/**
 *
 * @author miria
 */
public class Ejercicio7 {
    
     public Ejercicio7(){
     ejercicio7();
 } 
   
    
     public void ejercicio7(){
    System.out.println("Ingrese una frase/palabra: ");
    Scanner miscanner=new Scanner(System.in);
    String frase=miscanner.nextLine();
        
        while(true){
        try{
            
        System.out.println("Ingrese el numero de posicion del caracter: ");
        int posicion=miscanner.nextInt();
        if(posicion<0){
            System.out.println("Posicion mal ingresada ");
            break;
        }
        else if(posicion>frase.length()){
            //length es la longitud de la frase
            System.out.println("Te pasaste");
            break;
        }
            
            System.out.println("Ingrese un caracter alfabetico: ");
        char caracter=miscanner.next().charAt(0);//charAt sirve para leer el caracter en la posicion 'index'(la que uno le dice)
          
        if(frase.charAt(posicion)==caracter){
            System.out.println("Correcto, el caracter esta en la posicion "+ posicion);
            break;
        }
        else{
            System.out.println("El caracter no corresponde a la posicion " + posicion);
        }
        }
        catch(Exception E){
            System.out.println("Error"); 
        }
    }
    }
}
