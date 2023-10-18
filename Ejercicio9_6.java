package menu;

/**
 *
 * @author miria
 */
public class Ejercicio9_6 {
    class Vehiculo{
        
        public String marca;
        public String modelo;
        public int año;

        public Vehiculo(String marca, String modelo, int año){
            this.marca = marca;
            this.modelo = modelo;
            this.año = año;
        }
        public void datosVehiculo(){
            System.out.println("DATOS DEL VEHICULO: ");
            System.out.println("Marca: "+marca);
            System.out.println("Modelo: "+modelo);
            System.out.println("Año: "+año);
            System.out.println(" - ");
        }

        public void acelerar(){
            System.out.println("El vehiculo "+marca+" aceleró");
        }
        public void frear(){
            System.out.println("El vehiculo "+marca+" frenó");
        }
        public void encender(){
            System.out.println("El vehiculo "+marca+" encendió");
        }
    }
        public class main{
            public  void main(String[] args) {
                Vehiculo vehiculo1 = new Vehiculo("Toyota", "Cruze", 2021);
                
                vehiculo1.datosVehiculo();
                vehiculo1.acelerar();
                vehiculo1.frear();
                vehiculo1.encender();

        }
    }
    
}

