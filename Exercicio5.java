import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Digite a operação (+, -, *, /, ^): ");
        char operacao = scanner.next().charAt(0);

        double resultado;
        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Erro: divisão por zero.");
                    return;
                }
                resultado = num1 / num2;
                break;
            case '^':
                resultado = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Símbolo da operação inválido.");
                return;
        }

        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
