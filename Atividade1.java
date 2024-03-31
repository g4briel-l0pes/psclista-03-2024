import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[12];
        int contador = 0;
        int soma = 0;

        System.out.println("Digite 12 temperaturas diárias entre 4° e 10°");

        while (contador < 12) {
            int numero = scanner.nextInt();
            if (numero >= 4 && numero <= 10) {
                numeros[contador] = numero;
                soma += numero;
                contador++;
            } else {
                System.out.println("Temperatura inválida.");
            }
        }

        double media = (double) soma / 12;
        media = Math.round(media * 10.0) / 10.0; // Arredondando para 1 casa decimal
        System.out.println("A média de hoje das temperaturas é: " + media + "°C");
    }
}