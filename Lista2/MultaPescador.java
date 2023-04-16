import java.util.Scanner;

public class MultaPescador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso dos peixes em quilos: ");
        double peso = scanner.nextDouble();

        double excesso = peso - 50;
        double multa = 0;

        if (excesso > 0) {
            multa = excesso * 4;
        } else {
            excesso = 0;
        }

        System.out.printf("Excesso de peso: %.2f kg%n", excesso);
        System.out.printf("Valor da multa: R$ %.2f%n", multa);

        scanner.close();

    }
}
