import java.util.Scanner;

public class TempoDeDownload {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do arquivo para download (em MB): ");
        double tamanhoArquivo = scanner.nextDouble();

        System.out.print("Digite a velocidade da conexão à Internet (em Mbps): ");
        double velocidadeInternet = scanner.nextDouble();

        double tempoSegundos = (tamanhoArquivo * 8) / velocidadeInternet;
        double tempoMinutos = tempoSegundos / 60;

        System.out.printf("Tempo aproximado de download: %.2f minutos%n", tempoMinutos);
    }
}
