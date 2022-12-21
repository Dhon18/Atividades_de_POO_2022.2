package lista_01_poo;
import java.util.Scanner;
public class Televisao {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    ControleRemoto controleremoto = new ControleRemoto();
    int op=0, per=0, vol=0;
    do{
      
        System.out.println("Você deseja: ");
        System.out.println("1- Aumentar: ");
        System.out.println("2- Diminuir: ");
        System.out.println("3- Pular Canal: ");
        System.out.println("4- Retroceder Canal: ");
        op = leia.nextInt();
        
        switch(op){
        
        case 1:
            System.out.println("\nAumentar: ");
            controleremoto.setAum(leia.nextInt());
            vol += 1;
            if(vol == 10 ){
                System.out.println("Volume Máximo");
                break;
            }
            break;
        case 2:
            System.out.println("\nDiminuir: ");
            controleremoto.setDim(leia.nextInt());
            vol -= 1;
            break;
        case 3:
            System.out.println("\nPular Canal: ");
            controleremoto.setMudaum(leia.nextInt());
            vol += 1;
            break;
        case 4:
            System.out.println("\nRetroceder Canal: ");
            controleremoto.setMuddim(leia.nextInt());
            vol -= 1;
            
            break;
        default:
            System.out.println("\n\nDeseja continuar?: ");
            System.out.println("1- SIM" + "\n 2-NÃO");
            per = leia.nextInt();
    }
        
        
    }while(per == 1);
        System.out.println("FIM DO SISTEMA!!");
    }
}