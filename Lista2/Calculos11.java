import java.util.Scanner;

public class Calculos11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int primeiroInteiro = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int segundoInteiro = scanner.nextInt();

        System.out.print("Digite um número real: ");
        double numeroReal = scanner.nextDouble();

        double resultado1 = (primeiroInteiro * 2) * (segundoInteiro / 2.0);
        double resultado2 = (primeiroInteiro * 3) + numeroReal;
        double resultado3 = Math.pow(numeroReal, 3);

        System.out.printf("O produto do dobro do primeiro com metade do segundo: %.2f%n", resultado1);
        System.out.printf("A soma do triplo do primeiro com o terceiro: %.2f%n", resultado2);
        System.out.printf("O terceiro elevado ao cubo: %.2f%n", resultado3);
    }
}
