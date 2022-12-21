package exemplodefinally;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ExemplodeFinally {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("C:\\Users\\dhona\\OneDrive\\Documentos\\AlertaFinally.txt");
        Scanner leia = null;
        
        
        
        try{
        leia = new Scanner(file);
        System.out.println(leia.nextLine());
        }catch(FileNotFoundException e){
            System.out.println("Erro ao abrir o arquivo");
        }finally{
            if(leia != null){
                leia.close();
            }
            System.out.println("BLOCO FINAL EXECUTADO");
        }
    }
}