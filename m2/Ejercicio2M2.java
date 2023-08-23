import java.util.Scanner;

public class Ejercicio2M2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la altura de la escala: ");
        int altura = scanner.nextInt();
        
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        
        for (int i = altura; i >= 1; i--) {
            for (int j = 0; j < altura - i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }

}
