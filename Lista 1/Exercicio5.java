import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite as 4 notas de avaliação bimestral:");

        double nota1 = input.nextDouble();
        double nota2 = input.nextDouble();
        double nota3 = input.nextDouble();
        double nota4 = input.nextDouble();

        double somaNotas = nota1 + nota2 + nota3 + nota4;
        double mediaNotas = somaNotas / 4;

        System.out.println("A soma total das notas é " + somaNotas + ".");
        System.out.println("A média das notas é " + mediaNotas + ".");
    }
}