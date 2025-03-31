import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.141592;

        System.out.print("Digite o código da operação (1 - perímetro, 2 - área, 3 - volume): ");
        int operacao = scanner.nextInt();
        System.out.print("Digite o raio: ");
        double raio = scanner.nextDouble();

        switch (operacao) {
            case 1:
                System.out.printf("Perímetro do círculo: %.2f\n", 2 * PI * raio);
                break;
            case 2:
                System.out.printf("Área do círculo: %.2f\n", PI * Math.pow(raio, 2));
                break;
            case 3:
                System.out.printf("Volume da esfera: %.2f\n", (4.0 / 3.0) * PI * Math.pow(raio, 3));
                break;
            default:
                System.out.println("Código de operação inválido.");
        }

        scanner.close();
    }
}
