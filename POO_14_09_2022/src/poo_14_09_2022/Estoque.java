package poo_14_09_2022;
public class Estoque {
    String nome;
    double preco;
    int qtde;    
    public double totalValoreEstoque(){
        return preco * qtde;
    }public void addProdutos(int qtde){
        this.qtde+=qtde;
    }public void removeProdutos(int qtde){
        this.qtde-=qtde;
    }public String toString(){
        return nome + ", R$ "+preco+", quantidade "+qtde+" unidade, total: R$ "+ totalValoreEstoque();
    }   
}