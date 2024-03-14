import java.util.Scanner;

public class Atividade2 {

    private static final int[] notas = {50, 20, 10, 5, 2, 1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do valor da compra
        System.out.print("Digite o valor da compra: R$");
        double valorCompra = scanner.nextDouble();

        // Leitura do valor pago
        System.out.print("Digite o valor pago: R$");
        double valorPago = scanner.nextDouble();

        // Cálculo do troco
        double troco = valorPago - valorCompra;

        // Verificação do valor pago
        if (troco < 0) {
            System.out.println("**ERRO:** Valor pago insuficiente para realizar a compra.");
            return;
        }

        // Cálculo da quantidade de notas
        int[] quantidadeNotas = calcularQuantidadeNotas(troco);

        System.out.printf("Troco: R$%.2f\n", troco);
        System.out.println("Notas a serem fornecidas:");

        for (int i = 0; i < notas.length; i++) {
            if (quantidadeNotas[i] > 0) {
                System.out.printf("%d nota(s) de R$%d\n", quantidadeNotas[i], notas[i]);
            }
        }
    }

    private static int[] calcularQuantidadeNotas(double troco) {
        int[] quantidadeNotas = new int[notas.length];
        for (int i = 0; i < notas.length; i++) {
            quantidadeNotas[i] = (int) (troco / notas[i]);
            troco -= quantidadeNotas[i] * notas[i];
        }
        return quantidadeNotas;
    }
}