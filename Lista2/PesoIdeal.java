import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu gênero (M para masculino, F para feminino): ");
        char genero = scanner.next().toUpperCase().charAt(0);

        double pesoIdeal;

        if (genero == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (genero == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Gênero inválido!");
            return;
        }

        System.out.printf("Seu peso ideal é: %.2f kg%n", pesoIdeal);
    }
}
