/*
Uma financeira usa o seguinte critério para conceder empréstimos: o valor total 
do empréstimo deve ser até dez vezes o valor da renda mensal do solicitante e o 
valor da prestação deve ser no máximo 30% da renda mensal do solicitante. Escreva 
um programa que leia a renda mensal de um solicitante, o valor total do empréstimo 
solicitado e o número de prestações que o solicitante deseja pagar e informe se o 
empréstimo pode ou não ser concedido.
 */
package lista_03_revisão_de_lógica;
import java.util.Scanner;
    class Lista_03_Questao_01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        float redmensal,valemprestimo, presta, mult, porc;
        
        System.out.println("Digite a sua renda Mensal: ");
        redmensal = leia.nextFloat();
        System.out.println("Digite o Valor do Emprestimo: ");
        valemprestimo = leia.nextFloat();
        System.out.println("Digite o total de prestações: ");
        presta = leia.nextFloat();
        
        mult = redmensal * 10;
        
        
        if(redmensal <= valemprestimo){
            porc = (float) (redmensal - 0.30);
            if(valemprestimo >= 0.30){
                if(presta >= 10){
                    System.out.println("Emprestimo aprovado");    
                }                   
            }
        }else{
            System.out.println("Emprestimo Recusado");
        }               
    }
}