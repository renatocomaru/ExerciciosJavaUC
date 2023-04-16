import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor em metros: ");
        double metros = input.nextDouble();

        double centimetros = metros * 100;

        System.out.println(metros + " metros correspondem a " + centimetros + " centímetros.");

        input.close();
    }
}
