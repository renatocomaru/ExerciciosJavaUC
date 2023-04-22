/* Nome do Aluno: Renato Matos
* RA: 1292314966
* Nome do Programa: prob6.cs
* Data: 22/04/2023
*/
using System;

class GasVolume {
    static void Main(string[] args) {
        Console.Write("Digite o volume inicial em centímetros cúbicos: ");
        double volumeInicial = double.Parse(Console.ReadLine());

        double volumeAtual = volumeInicial;
        int segundos = 0;

        while (volumeAtual <= 1000) {
            volumeAtual *= 2;
            segundos++;
        }

        Console.WriteLine("O tempo necessário para o volume ultrapassar 1000 centímetros cúbicos é: " + segundos + " segundos.");
    }
}
