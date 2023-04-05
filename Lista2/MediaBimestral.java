import java.util.Scanner;

public class MediaBimestral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaNotas = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a nota do " + i + "º bimestre: ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }

        double media = somaNotas / 4;
        System.out.println("A média das notas é: " + media);
    }
}
