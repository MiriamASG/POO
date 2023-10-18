package menu;
import java.util.Scanner;

/**
 *
 * @author miria
 */
public class Ejercicio1 {
    
 private float nota_1;
 private float nota_2;
 private float nota_3;
 private float nota_4;
 
 public Ejercicio1(){
     ejercicio1();
 }
    
    public void ejercicio1(){
    
   Scanner scanner=new Scanner(System.in);
    System.out.println("Ingrese la nota 1: ");
    nota_1=scanner.nextInt();
    System.out.println("Ingrese la nota 2: ");
    nota_2=scanner.nextInt();
    System.out.println("Ingrese la nota 3: ");
    nota_3=scanner.nextInt();
    System.out.println("Ingrese la nota 4: ");
    nota_4=scanner.nextInt(); 
    Mostrar_los_promedios();
    }
     public void Mostrar_los_promedios(){
     float Promedio=Calcular_el_promedio();
     System.out.println("El promedio es: "+ Promedio);
     if(Promedio<4){
         System.out.println("Libre");
     }else if(Promedio<7){
         System.out.println("Regular");
     }else{
         System.out.println("Promocion");
     }
 }
     public float Calcular_el_promedio(){
  
     return (nota_1+nota_2+nota_3+nota_4)/4;
 }
}
