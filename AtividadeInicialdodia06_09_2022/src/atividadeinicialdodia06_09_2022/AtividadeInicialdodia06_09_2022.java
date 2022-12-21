package atividadeinicialdodia06_09_2022;
import java.util.Scanner;
public class AtividadeInicialdodia06_09_2022 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int vet[][] = new int[3][3];
        
        int i, j;
        
        for(i = 0 ; i < 3 ; i++){
            for(j = 0 ; j < 3 ; j++){
                System.out.println("Digite os valores na coluna ["+i+"] linha ["+j+"] :");
                vet[i][j] = leia.nextInt();
            }
        }
        
        
        for(i = 0 ; i < 0 ; i++){
            for(j = 0 ; j < 0 ; j++){
                System.out.println(vet[i][j]);
            }
        }for(i = 0 ; i < 1 ; i+=3){
            for(j = 0 ; j < 1 ; j+=1){
                System.out.println(vet[i][j]);
            }
        }for(i = 0 ; i < 3 ; i+=2){
            for(j = 0 ; j < 3 ; j+=2){
                System.out.println(vet[i][j]);
            }
        }
        
        
        
        //System.out.println("\n \n" + vet[0][0] + "\n" + vet[1][1] + "\n" + vet[2][2]);       
    }  
}