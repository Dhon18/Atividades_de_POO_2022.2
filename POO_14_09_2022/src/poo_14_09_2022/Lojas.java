package poo_14_09_2022;
import java.util.Scanner;
public class Lojas {
    public static void main(String[] args) {    
    Scanner leia = new Scanner(System.in);
    Estoque prod = new Estoque();   
        System.out.println("Informe o nome do produto: ");
        prod.nome = leia.nextLine();
        System.out.println("Preço: ");
        prod.preco = leia.nextDouble();
        System.out.println("Quantidade: ");
        prod.qtde = leia.nextInt();
        System.out.println(prod.nome + ", "+ prod.preco + ", "+prod.qtde+", "+prod.totalValoreEstoque());        
        System.out.println("\n\n Entre com o número de produtos para ser adicionado no estoque: ");        
        int qtde = leia.nextInt();
        prod.addProdutos(qtde);
        System.out.println("Atualização de estoque: "+prod.toString());        
        System.out.println("\n\n Entre com o número de produtos para ser removido do estoque: ");        
        qtde = leia.nextInt();
        prod.removeProdutos(qtde);
    }
}