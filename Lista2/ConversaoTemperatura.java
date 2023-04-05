import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = 5 * ((fahrenheit-32)/9);

        System.out.println("A temperatura em Celcius é de: " + celsius + ".");

    }
  }
