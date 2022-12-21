package lista_01_poo;
import java.util.Scanner;
public class Predio {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    Elevador predio = new Elevador();
int op = 0;

   
    System.out.println("Informe a quantidade de andares do predio");
    predio.setTotalAndares(leia.nextInt());
    System.out.println("Informe a capacidade do elevador");
    predio.setCapacidade(leia.nextInt());
    
    
    System.out.println("1 - Entrar\n2 - sair\n3 - subir\n4 - descer");
    op = leia.nextInt();
    switch(op){
        
        case 1:
            System.out.println("\nInforme quantas pessoas entraram no elevador?");
            predio.acrescenta(leia.nextInt());
            break;
        case 2:
            System.out.println("\nInforme quantas pessoas sairam do elevador");
            predio.sai(leia.nextInt());
            break;
        case 3:
            predio.subir();
            break;
        case 4:
            predio.descer();
            break;
            
    }
    System.out.println(predio.toString());
    
    }
}