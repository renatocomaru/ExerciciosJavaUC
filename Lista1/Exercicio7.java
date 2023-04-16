import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tamanho em metros quadrados da área a ser pintada: ");
        double area = input.nextDouble();

        int qtdLatas = (int) Math.ceil(area / 54);
        double precoTotal = qtdLatas * 80.0;

        System.out.println("Você precisará de " + qtdLatas + " latas de tinta.");
        System.out.println("O preço total será de R$ " + precoTotal + ".");

        input.close();
    }
}
