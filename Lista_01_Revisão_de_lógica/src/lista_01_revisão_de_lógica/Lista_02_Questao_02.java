/*
2º) Uma empresa quer verificar se um empregado está qualificado para a 
aposentadoria ou não. Para estar em condições, um dos seguintes requisitos 
deve ser satisfeito:

- Ter no mínimo 65 anos de idade.
- Ter trabalhado no mínimo 40 anos.
- Ter no mínimo 60 anos e ter trabalhado no mínimo 35 anos.

Com base nas informações acima, faça um algoritmo que leia: o número do 
empregado (código), o ano de seu nascimento e o ano de seu ingresso na empresa. 
O programa deverá escrever a idade e o tempo de trabalho do empregado e a mensagem 
'Requerer aposentadoria' ou 'Não requerer'.

 */
package lista_01_revisão_de_lógica;
import java.util.Scanner;
public class Lista_02_Questao_02 {
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);
        
        int Nempre, anonasc, anoingres, des1, des2;
        
        System.out.println("Digite o código do empregado: ");
        Nempre = leia.nextInt();
        System.out.println("Digite o ano de Nascimento: ");
        anonasc = leia.nextInt();
        System.out.println("Digite o ano de ingresso na empresa: ");
        anoingres = leia.nextInt();
        des1 = 2022 - anonasc;
        des2 = 2022 - anoingres;
        
        if((des1 >= 65) && (des2 >= 40)){
            
                System.out.println("Requerer aposentadoria, idade " + des1 + " tempo de ingresso " + des2 + " anos");
                      
        }
        else if((des1 >= 60) &&(des2 >= 35) ){
            
            System.out.println("Requerer aposentadoria, idade " + des1 + " tempo de ingresso " + des2 + " anos");
                       
        }
        else{
            System.out.println("Não requerer, idade " + des1 + " tempo de ingresso " + des2 + " anos");
        }       
    }      
}