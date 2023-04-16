import java.util.Scanner;

public class LojaDeTintas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho em metros quadrados da área a ser pintada: ");
        double area = scanner.nextDouble();

        double litrosNecessarios = area / 3;
        int latasNecessarias = (int) Math.ceil(litrosNecessarios / 18);
        double precoTotal = latasNecessarias * 80;

        System.out.println("Quantidade de latas de tinta a serem compradas: " + latasNecessarias);
        System.out.printf("Preço total: R$ %.2f%n", precoTotal);

        scanner.close();

    }
}
