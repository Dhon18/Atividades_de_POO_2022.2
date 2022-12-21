/*
8ª) Uma fruteira está vendendo frutas com a seguinte tabela de preços:

Itens          |   Até 5 Kg        |   Acima de 5 Kg
Morangos       | R$ 2,50 por Kg    |   R$ 2,20 por Kg
Maçãs          | R$ 1,80 por Kg    |   R$ 1,50 por Kg

Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, 
receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a 
quantidade (em Kg) de morangos e a quantidade (em Kg) de maçãs adquiridas e escreva o 
valor a ser pago pelo cliente.

 */
package lista_02_revisão_de_lógica;
import java.util.Scanner;
public class Lista_1_Questao08 {
    public static void main(String[] args){
     Scanner leia = new Scanner(System.in);          
       float maca, morango, desc, ident;     
        System.out.println("Digite 1- Comprou por Kg ou 2- Comprou por Dinheiro");
        ident = leia.nextInt();       
        if(ident == 1){
            float soma;
            System.out.println("Quantos quilos de maçã você comprou?");
            maca = leia.nextFloat();
            System.out.println("Quantos quilos de morango você comprou?");
            morango = leia.nextFloat();           
            soma = maca + morango;
            if(soma > 8){    
                desc = (float) (soma - 0.10);
                System.out.println("O cliente deverá pagar:" + desc + ",00 R$");
            }
            else if(soma < 8){
                soma = maca + morango;
                System.out.println("O cliente deverá pagar:" + soma + ",00 R$");
                }           
        }   
        if(ident == 2){
            float soma;
            System.out.println("Em quantos reais de maçã você comprou?");
            maca = leia.nextFloat();
            System.out.println("Em quantos reais de morango você comprou?");
            morango = leia.nextFloat();            
            soma = maca + morango;
            if(soma > 25){    
                desc = (float) (soma - 0.10);
                System.out.println("O cliente deverá pagar:" + desc + ",00 R$");
            }
            else if(soma < 25){
                soma = maca + morango;
                System.out.println("O cliente deverá pagar:" + soma + ",00 R$");
            }
        }       
    }   
}