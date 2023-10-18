package menu;

/**
 *
 * @author miria
 */
public class Ejercicio9_3 {
    
    class Rectangulo{
    public double altura;
    public double ancho;
    public String color;
    public Rectangulo(double alturas, double anchos, String colores){
        this.altura = alturas;
        this.ancho = anchos;
        this.color = colores;
    }
    public void datosRectangulo(){
        System.out.println("DATOS");
        System.out.println("Altura: "+altura+"cm");
        System.out.println("Ancho: "+ancho+"cm");
        System.out.println("Color: "+color);
        System.out.println("---------------");
    }
    public void calcularArea(){
        System.out.println("El area del rectangulo es: "+(altura*ancho)+" cm2.");
    }
    public void calcularPerimetro(){
        System.out.println("El perimetro del rectangulo es: "+(altura*2+ancho*2)+" cm.");
    }
}

public class Main{
    public void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(6,10,"Verde");
        rectangulo1.datosRectangulo();
        rectangulo1.calcularArea();
        rectangulo1.calcularPerimetro();
    }
}
    
}
