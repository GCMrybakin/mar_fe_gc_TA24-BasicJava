import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio2M4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] preciosBoletos = { 5, 10, 20, 50, 100, 200, 500 };
        int precioTotalBoletos = 0;

        String[] menu = { "Espaghettis", "Carne", "Pizza", "Arroz" };
        int[] preciosPlatos = { 10, 15, 12, 20 };

        System.out.println("Seleccione el numero del boleto que desea comprar:");
        for (int i = 0; i < preciosBoletos.length; i++) {
            System.out.println((i + 1) + ". Boleto $" + preciosBoletos[i]);
        }
        
        int opcionBoleto = scanner.nextInt();
        if (opcionBoleto >= 1 && opcionBoleto <= preciosBoletos.length) {
            precioTotalBoletos = preciosBoletos[opcionBoleto - 1];
        } else {
            System.out.println("Opcion no valida. Seleccionando boleto de $5 por defecto.");
            precioTotalBoletos = preciosBoletos[0];
        }

        ArrayList<Integer> ordenes = new ArrayList<>();
        int continuar = 1;

        while (continuar == 1) {
            System.out.println("Menu:");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i] + " - $" + preciosPlatos[i]);
            }

            System.out.print("Seleccione el numero del plato que desea comer: ");
            int opcion = scanner.nextInt();

            try {
                if (opcion >= 1 && opcion <= menu.length) {
                    ordenes.add(opcion - 1);
                } else {
                    throw new IllegalArgumentException("El plato seleccionado no existe en el menu.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            System.out.print("Desea continuar pidiendo comida? (1: si / 0: no): ");
            
            try {
                continuar = scanner.nextInt();
                if (continuar != 0 && continuar != 1) {
                    throw new IllegalArgumentException("Ingrese 1 para 'si' o 0 para 'no'.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continuar = 0;
            }
        }

        System.out.println("Su orden:");
        for (int orden : ordenes) {
            System.out.println("- " + menu[orden] + " - $" + preciosPlatos[orden]);
        }

        int precioTotalAlimentos = 0;
        for (int orden : ordenes) {
            precioTotalAlimentos += preciosPlatos[orden];
        }

        int precioTotal = precioTotalBoletos + precioTotalAlimentos;
        System.out.println("Precio total de boletos: $" + precioTotalBoletos);
        System.out.println("Precio total de alimentos: $" + precioTotalAlimentos);
        System.out.println("Precio total a pagar: $" + precioTotal);

        scanner.close();
    }
}
