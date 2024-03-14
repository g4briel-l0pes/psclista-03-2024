import java.util.Random;
import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        int numero2 = scanner.nextInt();
        int menorNumero;
        int maiorNumero;
        if (numero1 < numero2) {
            menorNumero = numero1;
            maiorNumero = numero2;
        } else {
            menorNumero = numero2;
            maiorNumero = numero1;
        }
        Random random = new Random();
        int numeroAleatorio = random.nextInt((maiorNumero - menorNumero) + 1) + menorNumero;
        System.out.println("O número aleatório gerado é: " + numeroAleatorio);
        if (numeroAleatorio % 2 == 0) {
            System.out.println("O número gerado é par.");
        } else {
            System.out.println("O número gerado é ímpar.");
        }

        scanner.close();
    }
}