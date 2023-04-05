import java.util.Scanner;

public class ConversaoTemperaturaCelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9.0/5.0) + 32;

        System.out.printf("A temperatura em graus Fahrenheit é: %.2f%n", fahrenheit);
    }
}
