import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite quanto você ganha por hora: ");
        double valorHora = input.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = input.nextDouble();

        double salario = valorHora * horasTrabalhadas;

        System.out.println("Seu salário neste mês será de R$ " + salario);

        input.close();
    }
}