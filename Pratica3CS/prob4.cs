/* Nome do Aluno: Renato Matos
* RA: 1292314966
* Nome do Programa: prob4.cs
* Data: 22/04/2023
*/
using System;

class NumeroNegativo {
    static void Main(string[] args) {
        int numero;

        do {
            Console.Write("Digite um número: ");
            numero = int.Parse(Console.ReadLine());
        } while (numero >= 0);

        Console.WriteLine("Você digitou o número: " + numero);
    }
}
