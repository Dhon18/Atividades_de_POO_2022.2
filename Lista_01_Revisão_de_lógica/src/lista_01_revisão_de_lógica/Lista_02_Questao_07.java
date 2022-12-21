/*
7º) Uma Cia de pulverização utiliza aviões para pulverizar lavouras. Os custos de 
pulverização dependem do tipo de praga e da área a ser contratada conforme a tabela:

Tipo 1 – ervas daninhas R$ 50,00 por acre;
Tipo 2 – gafanhotos R$ 100,00 por acre;
Tipo 3 – broca R$ 150,00 por acre;
Tipo 4 – todos acima R$ 250,00 por acre.

Se a área a ser pulverizada for superior a 1000 acres, o fazendeiro tem um desconto 
de 5%. Em adição, qualquer fazendeiro cujo custo for maior do que R$ 750,00 tem um 
desconto de 10% sobre o valor que ultrapassar os R$ 750,00. Caso ambos os descontos 
se apliquem o da área é calculado antes. Fazer um algoritmo que leia: o tipo de pulverização
(1 a 4) e área a ser pulverizada; e imprima o valor a ser pago.
 */
package lista_01_revisão_de_lógica;
import java.util.Scanner;
public class Lista_02_Questao_07 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        
        
         int tipo, area; 
  double total = 0,  valor ; 
         
         
        System.out.println("\tQual o tipo de praga! \nTipo 1 – ervas daninhas \nTipo 2 – gafanhotos \nTipo 3 – broca \nTipo 4 – todos acima "); 
            tipo = leia.nextInt(); 
             
        System.out.println("Digite o valor da área em acre a ser pulverizada"); 
            area = leia.nextInt(); 
             
          if(tipo == 1) { 
               total = area * 50;      
          }    
            
          if(tipo == 2) { 
               total = area * 100; 
          }          
           
          if(tipo == 3) { 
              total = area * 150; 
          }    
                 
          if(tipo == 4) { 
              total = area * 250; 
          } 
           
          if(area > 1000) {//desconto de 5% 
           total = total - (total * 0.05); 
          } 
           
          if( total > 750 ) { 
            
           valor = total - 750; 
           total = valor - (valor * 0.10); 
          } 
           
           
        System.out.println("A praga escolhida foi tipo " + tipo + " com uma area de " + area + " acres" + " totalizando a ser pago " + total);     
    }
}   