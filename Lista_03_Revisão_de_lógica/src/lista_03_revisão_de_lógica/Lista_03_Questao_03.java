/*
3º) Escreva um programa que leia um valor e imprima todas as possíveis 
combinações em que o lançamento de um par de dados tenha como resultado 
da soma dos valores dos dados o número lido. Por exemplo, se a entrada 
for o número 7, o programa deve imprimir as seguintes combinações:
●	1 6
●	2 5
●	3 4
●	4 3
●	5 2
●	6 1

 */
package lista_03_revisão_de_lógica;
import java.util.Scanner;
public class Lista_03_Questao_03 {
    public static void main (String[] args){
        Scanner leia = new Scanner (System.in);
        
        int n1, i ;
        
        System.out.println("Digite um valor: ");
        n1 = leia.nextInt();
        System.out.println("\n");
        
        for(i = 7 ; i >= 0 ; i--){           
            System.out.println(i);  
           } 
       for(n1 = 0 ; n1 < 7 ; n1++){
            System.out.println(n1);
                                
        }
    }   
}