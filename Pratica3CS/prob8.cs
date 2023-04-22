/* Nome do Aluno: Renato Matos
* RA: 1292314966
* Nome do Programa: prob8.cs
* Data: 22/04/2023
*/
using System;

class ZeroArray {
    static void Main(string[] args) {
        int[] vetor = new int[50];

        for (int i = 0; i < vetor.Length; i++) {
            vetor[i] = 0;
        }

        for (int i = 0; i < vetor.Length; i++) {
            Console.WriteLine("Vetor[" + i + "] = " + vetor[i]);
        }
    }
}
