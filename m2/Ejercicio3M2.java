
public class Ejercicio3M2 {
	public static void main(String[] args) {
        int hora = 0;
        int minutos = 0;
        int segundos = 0;

        while (true) {
            System.out.printf("%02d:%02d:%02d%n", hora, minutos, segundos);

            segundos++;

            if (segundos == 60) {
                segundos = 0;
                minutos++;

                if (minutos == 60) {
                    minutos = 0;
                    hora++;

                    if (hora == 24) {
                        hora = 0;
                    }
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
