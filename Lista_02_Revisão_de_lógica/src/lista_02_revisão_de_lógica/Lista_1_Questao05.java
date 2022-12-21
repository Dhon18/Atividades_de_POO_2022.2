/*
5º) Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e escrever 
o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior ou igual a zero 
escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.
 */
package lista_02_revisão_de_lógica;
import java.util.Scanner;
public class Lista_1_Questao05 {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    
    int Nconta, Saldo, Debito, Credito;
    
        System.out.println("Digite o número da sua conta: ");
        Nconta = leia.nextInt();
        System.out.println("Digite o seu Saldo: ");
        Saldo = leia.nextInt();
        System.out.println("Digite o Debito de sua conta: ");
        Debito = leia.nextInt();
        System.out.println("Digite o Credito da sua Conta: ");
        Credito = leia.nextInt();
        
        Saldo = Saldo - Debito + Credito;
    
    
    
    }
}