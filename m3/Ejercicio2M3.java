import java.util.Scanner;

public class Ejercicio2M3 {
	public static void main(String[] args) {
        double[][] notas = new double[5][3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresando notas para el estudiante " + (i + 1));
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese la nota " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < 5; i++) {
            double sumaNotas = 0;
            for (int j = 0; j < 3; j++) {
                sumaNotas += notas[i][j];
            }
            double promedio = sumaNotas / 3;

            System.out.print("El estudiante " + (i + 1) + " tiene un promedio de " + promedio);

            if (promedio >= 6) {
                System.out.println(" y ha aprobado.");
            } else {
                System.out.println(" y ha suspendido.");
            }
        }

        scanner.close();
    }

}
