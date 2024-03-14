import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número real:");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número real:");
        double numero2 = scanner.nextDouble();
        System.out.println("Digite o símbolo de operação (+, -, , / ou ^):");
        char operacao = scanner.next().charAt(0);
        double resultado = 0.0;
        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Erro: Divisão por zero.");
                    return;
                }
                break;
            case '^':
                resultado = Math.pow(numero1, numero2);
                break;
            default:
                System.out.println("Erro: Símbolo de operação inválido.");
                return;
        }
        System.out.println("O resultado da operação é: " + resultado);

        scanner.close();
    }
}