package povo;
import java.util.Scanner;
public class Povo {
public static void main(String[] args) {
Scanner ler = new Scanner (System.in);

    String nome = "";
    int ano = 0;
    float alt = 0;
    
    System.out.println("Informe o nome da pessoa");
    nome = ler.nextLine();
    
    ler = new Scanner (System.in);
    
    System.out.println("Informe o ano de nascimento da pessoa");
    ano = ler.nextInt();
    
    System.out.println("Informe a altura da pessoa");
    alt = ler.nextFloat();
    
    Pessoa p1 = new Pessoa(nome);
    
    p1.setDataNascimento(ano);
    p1.setAltura(alt);
    
    
    System.out.println("Todas as Informações de "+p1.getNome()+"\n"+p1.toString());
    
    System.out.println("A idade de "+p1.getNome()+" é "+p1.idade());
}
    
}
