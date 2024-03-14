import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        int valor1 = scanner.nextInt();
        if (valor1 == 1) {
            System.out.println("Digite o raio do círculo:");
            double raio = scanner.nextDouble();
            double perimetro = 2 * Math.PI * raio;
            System.out.println("O perímetro do círculo é: " + perimetro);
        }
        else if (valor1 == 2) {
            System.out.println("Digite o raio do círculo:");
            double raio = scanner.nextDouble();
            double area = Math.PI * raio * raio;
            System.out.println("A área do círculo é: " + area);
        }
        else if (valor1 == 3) {
            System.out.println("Digite o raio da esfera:");
            double raio = scanner.nextDouble();
            double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
            System.out.println("O volume da esfera é: " + volume);
        }
        else {
            System.out.println("Código de operação inválido. Por favor, insira um valor válido (1, 2 ou 3).");
        }

        scanner.close();
    }
}