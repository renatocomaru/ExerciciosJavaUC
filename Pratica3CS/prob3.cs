/* Nome do Aluno: Renato Matos
* RA: 1292314966
* Nome do Programa: prob3.cs
* Data: 22/04/2023
*/
using System;

class SomaNumeros {
    static void Main(string[] args) {
        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma += i;
        }

        Console.WriteLine("Soma dos números de 1 a 100: " + soma);
    }
}
