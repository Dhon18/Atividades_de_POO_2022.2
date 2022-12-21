package poo_14_09_2022;
import java.util.Scanner;
public class Conta {
    Scanner leia = new Scanner(System.in);
    int num;
    String nome;
    double saldo, valor, saque;
    
    public void depositar(){
        System.out.println("Informe o Valor: ");
        valor= leia.nextDouble();
        saldo += valor;
        System.out.println("\n \n Operação realizada com sucesso " + " Novo Saldo é de R$"+saldo);
    }
    public boolean sacar(){
            System.out.println("Informe o valor: ");
            saque = leia.nextDouble();
            if(saldo >= saque){
                saldo -= saque;
                return (true);
            }
            else{
                System.out.println("Saldo insuficiente: ");
                return false;
            }
    }public void consultaSaldo(){
            System.out.println("O saldo da conta é de R$" + saldo);
    }    
}