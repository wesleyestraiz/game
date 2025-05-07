import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroCorreto = random.nextInt(10) + 1;
        int tentativas = 0;
        int numeroDigitado;

        do {
            System.out.println("Digite um número entre 1 e 10: ");
            numeroDigitado = scanner.nextInt();
            tentativas++;

            if (numeroDigitado >= 11 || numeroDigitado <= 0) {
                System.out.println("Este número é divergente ao solicitado, por favor, tente novamente! ");
            }
            else if (numeroDigitado < numeroCorreto) {
                System.out.println("O número é maior. Tente novamente! ");
            } else if (numeroDigitado > numeroCorreto) {
                System.out.println("O número é menor. Tente novamente! ");
            }

        } while (numeroDigitado != numeroCorreto);

        System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas");

        scanner.close();
    }
}
