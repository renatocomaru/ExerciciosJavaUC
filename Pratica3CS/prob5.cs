/* Nome do Aluno: Renato Matos
* RA: 1292314966
* Nome do Programa: prob5.cs
* Data: 22/04/2023
*/
using System;

class Fatorial {
    static void Main(string[] args) {
        Console.Write("Digite um número para calcular o fatorial: ");
        int numero = int.Parse(Console.ReadLine());

        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        Console.WriteLine("O fatorial de " + numero + " é: " + fatorial);
    }
}
