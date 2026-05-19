import java.util.*;

public class Metodos {
    public static ArrayList<vehiculo> listaVehiculos = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    // 1. Registrar vehículo
    public static void registrarVehiculo() {
        System.out.println("\n--- REGISTRAR NUEVO VEHÍCULO ---");
        System.out.print("Placa: ");
        String placa = sc.nextLine();
        
        for (int i = 0; i < listaVehiculos.size(); i++) {
            if (listaVehiculos.get(i).getPlaca().equalsIgnoreCase(placa)) {
                System.out.println("Ya existe un vehículo con esa placa.");
                return;
            }
        }

        System.out.print("Marca: ");
        String marca = sc.nextLine();
        System.out.print("Modelo: ");
        String modelo = sc.nextLine();
        System.out.print("Año: ");
        int year = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Color: ");
        String color = sc.nextLine();
        System.out.print("Precio: ");
        double precio = sc.nextDouble();
        sc.nextLine(); 

        vehiculo vehiculos = new vehiculo(placa, marca, modelo, year, color, precio);
        listaVehiculos.add(vehiculos);
        System.out.println("Vehículo registrado con éxito.");
    }

    public static void mostrarVehiculos() {
        System.out.println("\n--- LISTA DE VEHICULOS REGISTRADOS ---");
    
        if (listaVehiculos.isEmpty()) {
            System.out.println("No hay vehiculos registrados en el sistema.");
            return;
        }
    
        System.out.printf("%-12s | %-15s | %-15s | %-6s | %-12s | %-12s\n", 
                          "Placa", "Marca", "Modelo", "Año", "Color", "Precio");
        System.out.println("-----------------------------------------------------------------------------------------");
    
        for (int i = 0; i < listaVehiculos.size(); i++) {
            System.out.println(listaVehiculos.get(i));
        }
    }

    // 3. Buscar vehículo por placa
    public static void buscarPorPlaca() {
        System.out.println("\n--- BUSCAR POR PLACA ---");
        System.out.print("Introduzca la placa a buscar: ");
        String placa = sc.nextLine();

        for (int i = 0; i < listaVehiculos.size(); i++) {
            vehiculo v = listaVehiculos.get(i);
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                System.out.println("\nVehículo Encontrado:");
                System.out.println(v);
                return; 
            } 
        } 

        System.out.println("No se encontró ningún vehículo con esa placa.");
    }

    public static void mostrarPorMarca() {
        System.out.println("\n--- BUSCAR POR MARCA ---");
        System.out.print("Introduzca la marca: ");
        String marca = sc.nextLine();

        boolean encontrado = false;
        System.out.println("\nResultados para la marca '" + marca + "':");
        
        for (int i = 0; i < listaVehiculos.size(); i++) {
            vehiculo v = listaVehiculos.get(i);
            if (v.getMarca().equalsIgnoreCase(marca)) {
                System.out.println(v);
                encontrado = true;
            }
        }

        if (encontrado == false) {
            System.out.println("No se encontraron vehículos de esa marca.");
        }
    }
}