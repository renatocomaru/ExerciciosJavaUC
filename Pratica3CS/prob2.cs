/* Nome do Aluno: Renato Matos
* RA: 1292314966
* Nome do Programa: prob2.cs
* Data: 22/04/2023
*/
using System;

class NumerosParesInverso {
    static void Main(string[] args) {
        for (int i = 100; i >= 1; i--) {
            if (i % 2 == 0) {
                Console.WriteLine(i);
            }
        }
    }
}
