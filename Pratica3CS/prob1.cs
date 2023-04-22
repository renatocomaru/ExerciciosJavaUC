/* Nome do Aluno: Renato Matos
* RA: 1292314966
* Nome do Programa: prob1.cs
* Data: 22/04/2023
*/
using System;

class NumerosPares {
    static void Main(string[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                Console.WriteLine(i);
            }
        }
    }
}