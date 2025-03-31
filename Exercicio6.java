import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        int sorteado = random.nextInt((maior - menor) + 1) + menor;

        System.out.println("Número sorteado: " + sorteado);
        if (sorteado % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        scanner.close();
    }
}