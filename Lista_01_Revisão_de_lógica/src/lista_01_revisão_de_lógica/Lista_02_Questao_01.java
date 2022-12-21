/*
1º) Faça um algoritmo para ler: a descrição do produto (nome), a quantidade 
adquirida e o preço unitário. Calcular e escrever o total (total = quantidade 
adquirida * preço unitário), o desconto e o 
total a pagar (total a pagar = total - desconto), sabendo-se que:

- Se quantidade <= 5 o desconto será de 2%
- Se quantidade > 5 e quantidade <=10 o desconto será de 3%
- Se quantidade > 10 o desconto será de 5%
 
*/
package lista_01_revisão_de_lógica;
import java.util.Scanner;
public class Lista_02_Questao_01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        
        String desc;
        int quant, total, precuni, result;
        
        
        System.out.println("Digite o nome do produto comprado: ");
        desc = leia.nextLine();
        System.out.println("Digite a quantidade comprada: ");
        quant = leia.nextInt();
        System.out.println("Digite o preço unitário: ");
        precuni = leia.nextInt();
        
        if(quant <= 5){
            total = quant * precuni;
            result = (int) (total - 0.02);
            System.out.println("O valor com desconto: 00," + result);
        }
        else if((quant > 5) && (quant <= 10)){
            total = quant * precuni;
            result = (int) (total - 0.03);
            System.out.println("O valor com desconto: 00," + result);
        }
        else{
            total = quant * precuni;
            result = (int) (total - 0.05);
            System.out.println("O valor com desconto: 00," + result);
       
        }
        
        
    }
}