import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();

        double area = Math.pow(lado, 2);
        double dobroArea = area * 2;

        System.out.println("O dobro da área do quadrado é: " + dobroArea);
    }
}
