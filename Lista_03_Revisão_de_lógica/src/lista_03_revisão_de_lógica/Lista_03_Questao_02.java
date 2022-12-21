/*
2º) Escreva um programa que receba dois números inteiros (considere que não são 
iguais) imprima todos os números inteiros do intervalo entre eles.
 */
package lista_03_revisão_de_lógica;
import java.util.Scanner;
public class Lista_03_Questao_02 {
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);
        
        int n1, n2;
        
        System.out.println("Digite o primeiro valor: ");
        n1 = leia.nextInt();
        System.out.println("Digite o segundo Valor: ");
        n2 = leia.nextInt();
        
        for(n1 = n1 ; n1 <= n2 ; n1++){
            System.out.println(n1+ "\n");
        }
        
    }
}
