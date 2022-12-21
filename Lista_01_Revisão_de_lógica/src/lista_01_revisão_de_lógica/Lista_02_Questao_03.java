/*
3º) Faça um algoritmo para ler as 3 notas obtidas por um aluno que fazem parte 
da avaliação. Calcular a média de aproveitamento, usando a fórmula abaixo e 
escrever o conceito do aluno de acordo com a tabela de conceitos mais abaixo:

            N1 + N2 + N3
Média = --------------------
                3

A atribuição de conceitos obedece a tabela abaixo:
Média             |     Conceito
 >= 9,0           |        A
>= 7,5 e < 9,0    |        B
> = 6,0 e < 7,5   |        C
< 6,0             |        D



 */
package lista_01_revisão_de_lógica;
import java.util.Scanner;
public class Lista_02_Questao_03 {
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);
        
        float nota1, nota2, nota3, media, resultado;
        
        System.out.println("Insra a priemira Nota: ");
        nota1 = leia.nextFloat();
        System.out.println("Insira a segunda Nota: ");
        nota2 = leia.nextFloat();
        System.out.println("Insira a Terceira Nota: ");
        nota3 = leia.nextFloat();
        media = nota1 + (nota2 + nota3);
        resultado = media / 3;
        
        if(resultado >= 9.0){
            System.out.println("A");
        }else if((resultado >= 7.5) && (resultado < 9.0)){
            System.out.println("B");
        }else if((resultado >= 6.0) && (resultado < 7.5)){
            System.out.println("C");
        }else if(resultado < 6.0){
            System.out.println("D");
        }
        
        
    }
}