import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] notas = {50, 20, 10, 5, 2, 1};

        System.out.print("Valor da compra: R$ ");
        int valorCompra = scanner.nextInt();
        
        System.out.print("Valor pago: R$ ");
        int valorPago = scanner.nextInt();
        
        if (valorPago < valorCompra) {
            System.out.println("Quantia insuficiente para realizar a compra.");
        } else {
            int troco = valorPago - valorCompra;
            System.out.println("Troco: R$ " + troco);
            
            for (int nota : notas) {
                int quantidade = troco / nota;
                troco %= nota;
                System.out.println("Notas de R$ " + nota + ": " + quantidade);
            }
        }
        
        scanner.close();
    }
}
