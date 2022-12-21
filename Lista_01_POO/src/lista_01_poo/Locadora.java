package lista_01_poo;
import java.util.Scanner;
public class Locadora {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String titulo = "",categoria = "";

    System.out.println("Informe o titulo do filme");
    titulo = leia.nextLine();

    System.out.println("Informe a categoria do filme:");
    System.out.println("Lançamento");
    System.out.println("Infantil");
    System.out.println("Promoção");
    categoria = leia.nextLine();
    
    Filmes filmes = new Filmes(titulo,categoria);
    
    System.out.println("Valor: "+filmes.getPreco());
        
    }
}