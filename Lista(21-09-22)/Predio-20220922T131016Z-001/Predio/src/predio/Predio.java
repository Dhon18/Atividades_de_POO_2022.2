package predio;
import java.util.Scanner;
public class Predio {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
Elevador e = new Elevador();
char parar = ' ';
int op = 0;

   
    System.out.println("Informe a quantidade de andares do predio");
    e.setTotalAndares(ler.nextInt());
    System.out.println("Informe a capacidade do elevador");
    e.setCapacidade(ler.nextInt());
    
    
do{
    System.out.println("1 - Entrar\n2 - sair\n3 - subir\n4 - descer");
    op = ler.nextInt();
    switch(op){
        
        case 1:
            System.out.println("Informe quantas pessoas entraram no elevador?");
            e.acrescenta(ler.nextInt());
            break;
        case 2:
            System.out.println("Informe quantas pessoas sairam do elevador");
            e.sai(ler.nextInt());
            break;
        case 3:
            e.sobe();
            break;
        case 4:
            e.desce();
            break;
            
    }
    System.out.println(e.toString());
    System.out.println("Deseja sair? ");
    parar = ler.next().charAt(0);
    
}while(parar != 's' && parar != 'S');


    
    
    
}
    
}
