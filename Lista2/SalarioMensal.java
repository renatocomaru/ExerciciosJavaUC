import java.util.Scanner;

public class SalarioMensal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quanto você ganha por hora: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        double salario = valorHora * horasTrabalhadas;

        System.out.println("Seu salário neste mês é: " + salario);

        scanner.close();
    }
}
