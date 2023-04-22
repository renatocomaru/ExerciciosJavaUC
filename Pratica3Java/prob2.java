/* Nome do Aluno: Renato Matos
* RA: 1292314966
* Nome do Programa: prob2.java
* Data: 22/04/2023
*/

package Pratica3Java;

public class prob2 {
  public static void main(String[] args) {
    /* Conta até 100 e só mostra os números pares em ordem descrescente */
      for (int i = 100; i >= 1; i--) {
          if (i % 2 == 0) {
              System.out.println(i);
          }
      }
  }
}
