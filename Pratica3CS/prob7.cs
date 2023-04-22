/* Nome do Aluno: Renato Matos
* RA: 1292314966
* Nome do Programa: prob7.cs
* Data: 22/04/2023
*/
using System;

class Elevator {
    static void Main(string[] args) {
        Console.Write("Digite a carga máxima do elevador (kg): ");
        double cargaMaxima = double.Parse(Console.ReadLine());
        Console.Write("Digite a quantidade máxima de pessoas: ");
        int maxPessoas = int.Parse(Console.ReadLine());

        int pessoasAtual = 0;
        double cargaAtual = 0;

        do {
            Console.Write("Digite o peso da pessoa " + (pessoasAtual + 1) + " (kg): ");
            double pesoPessoa = double.Parse(Console.ReadLine());

            if (cargaAtual + pesoPessoa <= cargaMaxima && pessoasAtual < maxPessoas) {
                cargaAtual += pesoPessoa;
                pessoasAtual++;
            } else {
                break;
            }
        } while (cargaAtual < cargaMaxima && pessoasAtual < maxPessoas);

        Console.WriteLine("O elevador atingiu sua carga máxima ou a quantidade máxima de pessoas.");
    }
}
