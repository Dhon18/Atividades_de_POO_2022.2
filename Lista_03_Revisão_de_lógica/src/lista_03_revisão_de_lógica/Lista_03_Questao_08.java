/*
8º) Escreva um algoritmo para ler 2 valores e se o segundo valor informado for 
ZERO, deve ser lido um novo valor, ou seja, para o segundo valor não pode ser 
aceito o valor zero e imprimir o resultado da divisão do primeiro valor lido 
pelo segundo valor lido.
*/
package lista_03_revisão_de_lógica;
import java.util.Scanner;
public class Lista_03_Questao_08 {
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);
 
        int n1,n2, res;
  
  System.out.println("digite o primeiro numero: ");
  n1 = leia.nextInt();
  
  System.out.println("digite o segundo numero: ");
  n2 = leia.nextInt();
  
  if(n2 == 0) {
   System.out.println("digite um novo numero: ");
   n2 = leia.nextInt();
  }
  
  res = n1 / n2;
  
  System.out.println("primeiro valor:  " + n1 + " dividido pelo segundo: " + n2 + " e igual: "  + res);
        
        
    }
}