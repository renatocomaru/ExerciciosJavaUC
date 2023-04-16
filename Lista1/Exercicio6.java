import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double tempF = input.nextDouble();

        double tempC = 5 * ((tempF - 32) / 9);

        System.out.println(tempF + " graus Fahrenheit equivalem a " + tempC + " graus Celsius.");

        input.close();
    }
}
