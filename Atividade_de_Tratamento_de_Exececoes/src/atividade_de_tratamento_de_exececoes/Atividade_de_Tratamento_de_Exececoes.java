package atividade_de_tratamento_de_exececoes;
import java.util.ArrayList;
import java.util.Scanner;
public class Atividade_de_Tratamento_de_Exececoes {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    ArrayList<Banco> banco = new ArrayList();
    int p;
    
        do{
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            int p2 = leia.nextInt();
            
            switch(p2){
                
        case 1:
        
        System.out.println("Digite o numero da conta: ");
        int numero = leia.nextInt();
        
        System.out.println("Digite o valor que deseja depositar: ");
        float saldo = leia.nextFloat();
        
        System.out.println("Digite seu nome: ");
        String nome = leia.nextLine();
        
        Banco inserir = new Banco();
        inserir.setNome(nome);
        inserir.setNumero(numero);
        inserir.setSaldo(saldo);
        banco.add(inserir);
                    
                    break;
            }
            
        
        
        
        Banco inserir = new Banco();
        System.out.println("Digite seu nome: ");
        String nome = leia.nextLine();
        inserir.getNome();
        inserir.getNumero();
        inserir.getSaldo();
        
        
        
            System.out.println("Você deseja continuar 1 - SIM 2 -NÃO");
            p = leia.nextInt();
            
        }while(p == 1);
        
        
        
    
    }   
}