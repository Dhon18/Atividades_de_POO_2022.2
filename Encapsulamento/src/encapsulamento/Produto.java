package encapsulamento;
import java.util.Scanner;
public class Produto {
    public static void main(String[] args) {      
        Scanner leia = new Scanner(System.in);
        
        Estoque estoque = new Estoque();
        
        System.out.println("Digite o nome do produto:");
        estoque.setNome( leia.next());
        
        System.out.println("Digite o valor do produto");
        estoque.setPreco( leia.nextDouble());
        
        System.out.println("Qual a quantidade");
        estoque.setQuantidade ( leia.nextInt());
        
        System.out.println(estoque.getNome());
        System.out.println(estoque.getQuantidade());
        System.out.println(estoque.getValTotal());
        System.out.println(estoque.totalVendasEstoque());
    }   
}