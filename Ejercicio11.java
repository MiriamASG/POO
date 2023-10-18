package menu;
import java.util.Scanner;
/**
 *
 * @author miria
 */
public class Ejercicio11 {
    

 class Vehiculo {
    private String marca;
    private String color;
    private String patente;

    public Vehiculo(String marca, String color, String patente) {
        this.marca = marca;
        this.color = color;
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
}

class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, String color, String patente, int cilindrada) {
        super(marca, color, patente);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}

class Auto extends Vehiculo {
    private int cantidadDeAsientos;

    public Auto(String marca, String color, String patente, int cantidadDeAsientos) {
        super(marca, color, patente);
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    public int getCantidadDeAsientos() {
        return cantidadDeAsientos;
    }

    public void setCantidadDeAsientos(int cantidadDeAsientos) {
        this.cantidadDeAsientos = cantidadDeAsientos;
    }
}

class Camion extends Vehiculo {
    private int capacidadDeCarga;

    public Camion(String marca, String color, String patente, int capacidadDeCarga) {
        super(marca, color, patente);
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public int getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCapacidadDeCarga(int capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

}

class Cliente {
    private String apellido;
    private String nombre;
    private String dni;
    private String telefono;

    public Cliente(String apellido, String nombre, String dni, String telefono) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

 public class Crear{
    public  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehiculo vehiculo = null;
        Cliente cliente = null;

        while (true) {
            System.out.println("1. Crear moto");
            System.out.println("2. Crear auto");
            System.out.println("3. Crear camion");
            System.out.println("4. Crear cliente");
            System.out.println("5. Imprimir datos del vehiculo");
            System.out.println("6. Imprimir datos del cliente");
            System.out.println("7. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                     System.out.print("Ingrese la marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Ingrese el color: ");
                    String color = scanner.nextLine();
                    System.out.print("Ingrese la patente: ");
                    String patente = scanner.nextLine();
                    System.out.print("Ingrese la cilindrada: ");
                    int cilindrada = scanner.nextInt();
                    vehiculo = new Moto(marca, color, patente, cilindrada);
                    break;
                case 2:
                    System.out.print("Ingrese la marca: ");
                    marca = scanner.nextLine();
                    System.out.print("Ingrese el color: ");
                    color = scanner.nextLine();
                    System.out.print("Ingrese la patente: ");
                    patente = scanner.nextLine();
                    System.out.print("Ingrese la cantidad de asientos: ");
                    int cantidadDeAsientos = scanner.nextInt();
                    vehiculo = new Auto(marca, color, patente, cantidadDeAsientos);
                    break;
                case 3:
                    System.out.print("Ingrese la marca: ");
                    marca = scanner.nextLine();
                    System.out.print("Ingrese el color: ");
                    color = scanner.nextLine();
                    System.out.print("Ingrese la patente: ");
                    patente = scanner.nextLine();
                    System.out.print("Ingrese la capacidad de carga: ");
                    int capacidadDeCarga = scanner.nextInt();
                    vehiculo = new Camion(marca, color, patente, capacidadDeCarga);
                    break;
                case 4:
                    System.out.print("Ingrese el apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el DNI: ");
                    String dni = scanner.nextLine();
                    System.out.print("Ingrese el teléfono: ");
                    String telefono = scanner.nextLine();
                    cliente = new Cliente(apellido, nombre, dni, telefono);
                    break;
                case 5:
                    if (vehiculo != null) {
                    // Imprimir datos del vehiculo
                    System.out.println("Marca: " + vehiculo.getMarca());
                    System.out.println("Color: " + vehiculo.getColor());
                    System.out.println("Patente: " + vehiculo.getPatente());

                    if (vehiculo instanceof Moto) {
                        Moto moto = (Moto) vehiculo;
                        System.out.println("Cilindrada: " + moto.getCilindrada());
                    } else if (vehiculo instanceof Auto) {
                        Auto auto = (Auto) vehiculo;
                        System.out.println("Cantidad de Asientos: " + auto.getCantidadDeAsientos());
                    } else if (vehiculo instanceof Camion) {
                        Camion camion = (Camion) vehiculo;
                        System.out.println("Capacidad de Carga: " + camion.getCapacidadDeCarga());
                    }
                    } else {
                        System.out.println("Primero debes crear un vehículo.");
                    }
                    break;
                case 6:
                if (cliente != null) {
                // Imprimir datos del cliente
                    System.out.println("Apellido: " + cliente.getApellido());
                    System.out.println("Nombre: " + cliente.getNombre());
                    System.out.println("DNI: " + cliente.getDni());
                    System.out.println("Teléfono: " + cliente.getTelefono());
                } else {
                    System.out.println("Primero debes crear un cliente.");
                }
                break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
}