package sala;
import java.util.Scanner;
public class Sala {
public static void main(String[] args) {
Tv tv = new Tv();
Controle c = new Controle(tv);
Scanner ler = new Scanner(System.in);

int op = 0;
char sair = ' ';

do{
    System.out.println("1 - aumentar o volume(1 unit)\n2 - abaixar o volume(1 unit)\n3 - setar volume\n4 - mudar canal(1 unit cima)\n5 - mudar canal(1 unit abaixo)\n6 - setar canal");
    switch(ler.nextInt()){
    
        
        case 1:
            c.setVolune('s');
            
            break;
        case 2:
            c.setVolune('d');
            break;
        case 3:
            System.out.println("Informe o valor desejado para o volume");
            c.setVolume(ler.nextInt());
            break;
        case 4:
            c.setCanal('c');
            break;
        case 5:
            c.setCanal('b');
            break;
        case 6:
            System.out.println("Informe o valor desejado para o canal");
            c.setCanal(ler.nextInt());
    }
    
    System.out.println(c.Info());
    
    System.out.println("Deseja sair?\nS/N");
    sair = ler.next().charAt(0);
    
    }while(sair != 's' && sair != 'S');
    
    
    
}
    
}
