import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tamanho da área a ser pintada (em metros quadrados): ");
        double area = input.nextDouble();

        int qtdLatas = (int) Math.ceil(area / 54); // 1 lata para cada 54 m² (18 litros = 54 m²)
        double precoTotal = qtdLatas * 80.0;

        System.out.println("Você precisará de " + qtdLatas + " latas de tinta.");
        System.out.println("O preço total será de R$ " + precoTotal + ".");
    }
}
