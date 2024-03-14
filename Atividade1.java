import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();

        System.out.println("Digite o terceiro número:");
        double numero3 = scanner.nextDouble();

        System.out.println("Você digitou os números: " + numero1 + ", " + numero2 + ", " + numero3);
        
        double maiorNumero = Math.max(numero1, Math.max(numero2, numero3));
        System.out.println("O maior número é: " + maiorNumero);
        
        double menorNumero = Math.min(numero1, Math.min(numero2, numero3));
        System.out.println("O menor número é: " + menorNumero);
        
        double media = (numero1 + numero2 + numero3) / 3;
        System.out.println("A média aritmética dos números é: " + media);

        scanner.close();
    }
}
