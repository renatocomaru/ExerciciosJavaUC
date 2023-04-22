/* Nome do Aluno: Renato Matos
* RA: 1292314966
* Nome do Programa: prob9.cs
* Data: 22/04/2023
*/
using System;

class ZeroMatrix {
    static void Main(string[] args) {
        int[,] matriz = new int[10, 10];

        for (int i = 0; i < matriz.GetLength(0); i++) {
            for (int j = 0; j < matriz.GetLength(1); j++) {
                matriz[i, j] = 0;
            }
        }

        for (int i = 0; i < matriz.GetLength(0); i++) {
            for (int j = 0; j < matriz.GetLength(1); j++) {
                Console.Write(matriz[i, j] + " ");
            }
            Console.WriteLine();
        }
    }
}
