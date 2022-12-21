package lista_01_poo;
import java.util.Scanner;
public class Pessoa {
    public static void main(String[] args) {
       Scanner leia = new Scanner(System.in);
       ChamaPessoa chamapessoa = new ChamaPessoa();
        
        System.out.println("Digite o seu nome: ");
        chamapessoa.setNome(leia.nextLine());
        
        System.out.println("Digite o ano de nascimento: ");
        chamapessoa.setDatanas(leia.nextInt());
        
        System.out.println("Digite a sua altura: ");
        chamapessoa.setAltura(leia.nextFloat());
        
        chamapessoa.calcularidade();
        chamapessoa.chamaresul();
    }   
}