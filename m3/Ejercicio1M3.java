import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1M3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] ciutats = new String[6];

        for (int i = 0; i < ciutats.length; i++) {
            System.out.print("Introduce el nombre de la ciudad " + (i + 1) + ": ");
            ciutats[i] = scanner.nextLine();
        }

        System.out.println("Ciudades introducidas:");
        for (String ciutat : ciutats) {
            System.out.println(ciutat);
        }

        Arrays.sort(ciutats);
        System.out.println("\nCiudades ordenadas alfabeticamente:");
        for (String ciutat : ciutats) {
            System.out.println(ciutat);
        }

        String[] ciutatsModificades = new String[ciutats.length];

        for (int i = 0; i < ciutats.length; i++) {
            ciutatsModificades[i] = ciutats[i].replace('a', '4');
        }

        Arrays.sort(ciutatsModificades);
        System.out.println("\nCiudades modificadas i ordenadas:");
        for (String ciutat : ciutatsModificades) {
            System.out.println(ciutat);
        }

        char[][] arraysCiutats = new char[ciutats.length][];

        for (int i = 0; i < ciutats.length; i++) {
            arraysCiutats[i] = new char[ciutats[i].length()];
            for (int j = 0; j < ciutats[i].length(); j++) {
                arraysCiutats[i][j] = ciutats[i].charAt(j);
            }
        }

        System.out.println("\nNombre de las ciudades invertidas:");
        for (char[] arrayCiutat : arraysCiutats) {
            for (int i = arrayCiutat.length - 1; i >= 0; i--) {
                System.out.print(arrayCiutat[i]);
            }
            System.out.println();
        }
    }
}

