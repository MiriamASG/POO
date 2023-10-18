package menu;
import java.util.Scanner;

/**
 *
 * @author miria
 */
public class Ejercicio5 {
    
      public Ejercicio5(){
     ejercicio5();
 } 
       public  void ejercicio5 (){
        Scanner miscanner=new Scanner(System.in);
        boolean primo=false;
        System.out.print("INGRESE UN NUMERO:");
        int numero=miscanner.nextInt();
        int num=numero;
        while(primo==false){
        num=num-1;
        primo=esPrimo(num);
        }
        System.out.println("El numero primo inferior a "+numero +" es: "+num);
    }
    
static boolean esPrimo (int par){
int resto = 1;
int n=2;
while((n<par/2) && (resto!=0)){
resto= (int) (par % n);
n++;
}
if (resto!=0)
return true;
else
return false;
}
}
      

