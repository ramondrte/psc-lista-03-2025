import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        int maior = Math.max(num1, Math.max(num2, num3));
        int menor = Math.min(num1, Math.min(num2, num3));
        double media = (num1 + num2 + num3) / 3.0;

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.printf("Média aritmética: %.2f\n", media);

        scanner.close();
    }
}
