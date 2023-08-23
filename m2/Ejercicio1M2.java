import java.util.*;

public class Ejercicio1M2 {
    public static void main(String[] args) {
        char[] nombre = {'M', 'a', 'n', 'u', 'e', 'l',' ','A','n','t','o','n','i','o'};
        
        for (char letra : nombre) {
            System.out.println(letra);
        }
        
        List<Character> nombreList = new ArrayList<>();
        Collections.addAll(nombreList, 'M', 'a', 'n', 'u', 'e', 'l');
        
        for (char letra : nombreList) {
            if (Character.isLetter(letra)) {
                if ("AEIOUaeiou".contains(String.valueOf(letra))) {
                    System.out.println("VOCAL");
                } else {
                    System.out.println("CONSONANT");
                }
            } else if (Character.isDigit(letra)) {
                System.out.println("No puede contener numeros.");
            }
        }
        
        Map<Character, Integer> contadordeLetras = new HashMap<>();
        for (char letter : nombreList) {
            if (Character.isLetter(letter)) {
                letter = Character.toLowerCase(letter);
                contadordeLetras.put(letter, contadordeLetras.getOrDefault(letter, 0) + 1);
            }
        }
        
        System.out.println(contadordeLetras);
        
        List<Character> listaApellido = new ArrayList<>();
        Collections.addAll(listaApellido, 'A','n','t','o','n','i','o');
        
        List<Character> nombreCompleto = new ArrayList<>(nombreList);
        nombreCompleto.add(' ');
        nombreCompleto.addAll(listaApellido);
        
        System.out.println(nombreCompleto);
    }
}
