package alunopoo;
import java.util.ArrayList;
import java.util.List;
public class Escola {
    public static void main(String[] args) {
    List<Estudande>list = new ArrayList<>();
    List<Produtos>list1 = new ArrayList<>();
      Produtos produto = new Produtos();
    //Estudande estudande = new Estudande();
    //list.add(new Estudande("Dhonatas", 1234));
    //list.add(new Estudande("Eneildes", 5678));
    //list.add(new Estudande("Luiza", 9101));
    //list.add(new Estudande("Pedro", 1213));
    //list.add(new Estudande("Carlos", 1415));
    list1.add(new Produtos("Açúcar" + 30.00));
    list1.add(new Produtos("Café" + 50.00));
    list1.add(new Produtos("Arroz" + 123.40));
    list1.add(new Produtos("Feijão" + 400.00));
    
    
    
    //for(Estudande e: list){
        //System.out.println(e);
    //}
    //list.remove(2);
    //list.forEach(n-> System.out.print("\n" + n));
    //list.removeIf(e -> e.getMatricula() == 1234);
    //list.forEach(n-> System.out.print("\n" + n));
    //list.removeIf(x-> x.getNome().charAt(0)=='L');
    
    
    
    
    
    }   
}