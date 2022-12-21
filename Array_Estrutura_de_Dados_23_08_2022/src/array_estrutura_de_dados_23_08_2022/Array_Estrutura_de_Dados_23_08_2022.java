/*
forma de declarar um vetor
int num[] = new int[]
 */
package array_estrutura_de_dados_23_08_2022;
import java.util.Scanner;
public class Array_Estrutura_de_Dados_23_08_2022 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
     
        int nota[] = new int[5];
        int soma=0, i, cal;
        
        for( i = 0 ; i < nota.length ; i++){
            System.out.println("Digite a nota: " + i);
            nota[i] = leia.nextInt();
        }
        for( i = 0 ; i < nota.length ; i++){
            soma += nota[i];
        }
        for( i = 0 ; i < nota.length ; i++){
            System.out.println("Notas dos Alunos: " + nota[i]);
        }
        cal = soma / 5;
        System.out.println("O resutado da média dos valores é: " + cal);            
    }   
}