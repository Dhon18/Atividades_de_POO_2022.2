package locadorafilmes;
import java.util.Scanner;
public class LocadoraFilmes {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in); 

String t = "",c = "";

    System.out.println("Informe o titulo do filme");
    t = ler.nextLine();

    System.out.println("Informe a categoria do filme\nLançamento,Infantil,Promoção");
    c = ler.nextLine();
    
    Filmes f = new Filmes(t,c);
    
    System.out.println("Valor: "+f.getPreco());
}
    
}
