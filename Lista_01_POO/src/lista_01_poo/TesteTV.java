package lista_01_poo;
import java.util.Scanner;
public class TesteTV {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
    ControleRemoto controleremoto = new ControleRemoto();
    int op=0, volume=0;
    while(true){
        System.out.println("Escolha uma opção:");
        System.out.println("(1) aumentar o volume \n(2) diminuir voulume");
        op = leia.nextInt();
        if(op == 1){
            controleremoto.setAum(op);
            controleremoto.aumnetar();
            
        }
        
        if(op == 2){
            controleremoto.setDim(op);
            controleremoto.diminuir();
            
        }
    }
    }
    
}
