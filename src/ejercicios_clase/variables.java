package ejercicios_clase;

import java.util.Scanner;

public class variables {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaración de variables primitivas
        int cantidadInventario;
        double precio;
        char categoria;
        boolean disponible;

        // Solicitar datos al usuario
        System.out.print("Ingrese la cantidad en inventario: ");
        cantidadInventario = scanner.nextInt();

        System.out.print("Ingrese el precio del producto: ");
        precio = scanner.nextDouble();

        System.out.print("Ingrese la categoría (una letra): ");
        categoria = scanner.next().charAt(0); // Leer solo un caracter

        System.out.print("¿Está disponible? (si/no): ");
        String respuesta = scanner.next().toLowerCase();
        disponible = respuesta.equals("si");

        // Mostrar datos en pantalla
        System.out.println("\n=== Información del Producto ===");
        System.out.println("Cantidad en inventario: " + cantidadInventario);
        System.out.println("Precio: $" + precio);
        System.out.println("Categoría: " + categoria);
        System.out.println("Disponible para la venta: " + (disponible ? "Sí" : "No"));

        scanner.close();
	}

}
