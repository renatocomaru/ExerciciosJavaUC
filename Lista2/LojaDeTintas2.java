import java.util.Scanner;

public class LojaDeTintas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho em metros quadrados da área a ser pintada: ");
        double area = scanner.nextDouble();
        area *= 1.1;

        double litrosNecessarios = area / 6;

        // Apenas latas de 18 litros
        int latas18 = (int) Math.ceil(litrosNecessarios / 18);
        double precoLatas18 = latas18 * 80;

        // Apenas galões de 3,6 litros
        int galoes36 = (int) Math.ceil(litrosNecessarios / 3.6);
        double precoGaloes36 = galoes36 * 25;

        // Mistura de latas e galões
        int latas = (int) (litrosNecessarios / 18);
        double litrosRestantes = litrosNecessarios % 18;
        int galoes = (int) Math.ceil(litrosRestantes / 3.6);
        double precoMisto = latas * 80 + galoes * 25;

        System.out.printf("Apenas latas de 18 litros: %d latas, total R$ %.2f%n", latas18, precoLatas18);
        System.out.printf("Apenas galões de 3,6 litros: %d galões, total R$ %.2f%n", galoes36, precoGaloes36);
        System.out.printf("Mistura de latas e galões: %d latas e %d galões, total R$ %.2f%n", latas, galoes, precoMisto);
    }
}