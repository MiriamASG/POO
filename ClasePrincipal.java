package menu;
import java.util.Scanner;

/**
 *
 * @author miria
 */
public class ClasePrincipal {
  
    
    public static void main(String[] args) {
     int opcion;
        System.out.println("Ingrese el numero de ejercicio: ");
        Scanner scanner=new Scanner(System.in);//esto es un objeto
        opcion=scanner.nextInt();
        switch(opcion){
        
            case 1:{
                Ejercicio1 e1=new Ejercicio1();
                break;}
            case 2:{
                Ejercicio2 e2=new Ejercicio2();
                break;}
            case 3:{
                Ejercicio3 e3=new Ejercicio3();
                break;}
            /*case 4:{
                Ejercicio4 e4=new Ejercicio4();
                break;}*/
            case 5:{
                Ejercicio5 e5=new Ejercicio5();
                break;}
            case 6:{
                Ejercicio6 e6=new Ejercicio6();
                break;}
            case 7:{
                Ejercicio7 e7=new Ejercicio7();
                break;}
            /*case 8:{
                Ejercicio8 e8=new Ejercicio8();
                break;}
            case 9:{
                Ejercicio9_1 e9=new Ejercicio9_1();
                break;}
            case 10:{
                Ejercicio10 e10=new Ejercicio10();
                break;}
            case 11:{
                Ejercicio11 e11=new Ejercicio11();
                break;}
            case 12:{
                Ejercicio12 e12=new Ejercicio12();
                break;}
            case 13:{
                Ejercicio13 e13=new Ejercicio13();
                break;}
            case 14:{
                Ejercicio14 e14=new Ejercicio14();
                break;}
            case 15:{
                Ejercicio15 e15=new Ejercicio15();
                break;}
            case 16:{
                Ejercicio16 e16=new Ejercicio16();
                break;}
            case 17:{
                Ejercicio17 e17=new Ejercicio17();
                break;}
            case 18:{
                Ejercicio18 e18=new Ejercicio18();
                break;}*/
            
        }
    }
}
