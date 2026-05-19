import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;

        do {
            System.out.println("\n|| ==================================== ||");
            System.out.println("||        REGISTRO DE VEHICULOS         ||");
            System.out.println("|| ==================================== ||");
            System.out.println("|| 1. Registrar vehiculo                ||");
            System.out.println("|| 2. Mostrar vehiculos                 ||");
            System.out.println("|| 3. Buscar vehiculo por placa         ||");
            System.out.println("|| 4. Mostrar vehiculos por marca       ||");
            System.out.println("|| 5. Salir                             ||");  
            System.out.print("\nSeleccione una opcion: ");
            
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    Metodos.registrarVehiculo();
                    break;
                case 2:
                    Metodos.mostrarVehiculos();
                    break;
                case 3:
                    Metodos.buscarPorPlaca();
                    break;
                case 4:
                    Metodos.mostrarPorMarca();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }

        } while (opcion != 5);
    }
}