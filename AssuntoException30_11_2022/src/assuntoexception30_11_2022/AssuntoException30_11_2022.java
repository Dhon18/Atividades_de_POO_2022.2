package assuntoexception30_11_2022;
import java.util.InputMismatchException;
import java.util.Scanner;
public class AssuntoException30_11_2022 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int i=0;
        
        do{
        try{               
        System.out.println("Informe o nome das pessoas: ");
        String[] vet = leia.nextLine().split(" ");
        
        System.out.println("Informe a posição que deseja consultar: ");
        int posicao = leia.nextInt();
        System.out.println(vet[posicao]);
        i=0;
        leia = new Scanner(System.in);
        }
        
        catch(ArrayIndexOutOfBoundsException e){ //Informa que estourou o limite do vetor
            System.out.println("Você estourou o limite maximo do vetor");
            leia = new Scanner(System.in);
        i=1;    
        }
        catch(InputMismatchException e){
            System.out.println("Erro de Entrada");
            leia = new Scanner(System.in);
        i=1;
            }
        }while(i != 0); 
        
        
        
        /*
        
        */
    }
}