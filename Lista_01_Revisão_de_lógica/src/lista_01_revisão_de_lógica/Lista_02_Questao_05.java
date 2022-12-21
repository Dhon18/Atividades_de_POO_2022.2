/*
5º) Um programa para gerenciar os saques de um caixa eletrônico deve possuir algum 
mecanismo para decidir o número de notas de cada valor que deve ser disponibilizado 
para o cliente que realizou o saque. Um possível critério seria o da "distribuição 
ótima" no sentido de que as notas de menor valor fossem distribuídas em número mínimo 
possível. Por exemplo, se a quantia solicitada fosse R$ 87,00, o programa deveria 
indicar uma nota de R$ 50,00, uma nota de R$ 20,00, uma nota de R$ 10,00, uma nota 
de R$ 5,00 e uma nota de R$ 2,00. Escreva um programa que receba o valor da quantia 
solicitada e retorne a distribuição das notas de acordo com o critério da distribuição 
ótima (considere existir notas de R$2,00; R$5,00; R$10,00; R$20,00; R$50,00 e R$100,00).
 */


package lista_01_revisão_de_lógica;
import java.util.Scanner;
public class Lista_02_Questao_05 {
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);
        
        int cedulas[]= {100, 50, 20 , 10, 5, 2};
  int qtdTotal = 0, valorReais = 0;
  int qtdCedulas[] = new int [6];
  
   System.out.println("Digite o valor a sacar");
         valorReais = leia.nextInt();
         
         for(int i=0; i < 6; i++ ) {
          qtdCedulas[i] = (valorReais/cedulas[i]);
          valorReais %= cedulas[i];
          qtdTotal += qtdCedulas[i];   
          
          System.out.println(qtdCedulas[i] + " Cedulas de: " + cedulas[i]);
         }
         System.out.println("Total de cedulas: " + qtdTotal);
    }
}
