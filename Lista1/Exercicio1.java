import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        System.out.println("O número informado foi " + numero + ".");

        input.close();
    }
}