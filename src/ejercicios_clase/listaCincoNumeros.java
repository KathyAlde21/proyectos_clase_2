package ejercicios_clase;

public class listaCincoNumeros {

	public static void main(String[] args) {
		// Ventas de lunes a viernes
		int[] ventas = {3500, 24500, 19980, 16020, 13000};
		String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};

        int total = 0;

        // Sumar las ventas
        System.out.println("=== Ventas Diarias ===");
        for (int i = 0; i < ventas.length; i++) {
        	System.out.println(dias[i] + ": $" + ventas[i]);
            total += ventas[i];
        }

        // Mostrar resultado
        System.out.println("\nTotal de ventas de la semana laboral:: $" + total);
        System.out.println("\nGracias");


	}

}
