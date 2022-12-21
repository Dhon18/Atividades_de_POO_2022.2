package poo_14_09_2022;
import java.util.Scanner;
public class Banco {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        int op = 0, num;
        Conta c1 = new Conta();
        c1.nome = "Bruno";
        c1.num = 1234;
        c1.saldo = 12.50;
        
        do{
            
            System.out.println("Informe a opção desejada: " + "\n 1 - Depositar" + "\n 2 - Sacar" + "\n 3 - Saldo" + "\n 4 - Sair");
            op = leia.nextInt();
            switch(op){
                case 1:
                    System.out.println("Informe o número da conta: ");
                    num = leia.nextInt();
                    if(num == 1234){
                        c1.num=num;
                        c1.depositar();
                    }
                    else{
                        System.out.println("Conta Inválida");
                    }
                    break;
                case 2:
                    System.out.println("Informe o número da conta: ");
                    num = leia.nextInt();
                    if(num == 1234){
                        c1.num=num;
                        c1.depositar();
                        c1.sacar();
                    }else{
                        System.out.println("Conta Inválida");
                    }
                    break;
                case 3:
                   System.out.println("Informe o número da conta: ");
                    num = leia.nextInt();
                    if(num == 1234){
                        c1.num=num;
                        c1.consultaSaldo();
                    }else{
                        System.out.println("Conta Inválida");
                    }
                    break;
                case 0:
                    System.out.println("Volte Sempre!");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            
        }while(op != 0);        
    }
}