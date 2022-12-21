package lista_01_poo;
public class Elevador {
    private int andarAtual,totalAndares,capacidade,quantPessoasEntram;
    
    Elevador(){
        this.andarAtual = 0;
        this.capacidade = 0;
    }
    Elevador(int capacidade){
        this.capacidade = capacidade;
    }
    
    int getAndarAtual(){
        return this.andarAtual;
    }
    int getTotalAndares(){
        return this.totalAndares;
    }
    int getCapacidade(){
        return this.capacidade;
    }
    int getQuantPessoasEntram(){
        return this.quantPessoasEntram;
    }
    
    void setAndarAtual(int quantidade){
        this.andarAtual = quantidade;
    }
    void setTotalAndares(int quantidade){
        this.totalAndares = quantidade;
    }
    void setCapacidade(int quantidade){
        this.capacidade = quantidade;
    }
    void setQuantPessoasEntram(int quantidade){
        this.quantPessoasEntram = quantidade;
    }
    public String toString(){
        return "Andar atual: "+this.andarAtual+"\nCapacidade do elevador: "+"\nTotal de Andares: "+this.totalAndares+this.capacidade+"\nQuantidade de pessoas no elevador: "+this.quantPessoasEntram;
    }
    
    void acrescenta(int quantidade){
        if(quantidade > this.capacidade || quantidade > (this.capacidade - this.quantPessoasEntram)){
            System.out.println("Capacidade maxíma atingida");
        }
        else{
            this.quantPessoasEntram += quantidade;
        }
    }
    void sai(int quantidade){
        if(quantidade > 0 && quantidade <= this.quantPessoasEntram){
            this.quantPessoasEntram -= quantidade;
        }
        else{
            System.out.println("Impossivel fazer a operação");
        }
    }
    void subir(){
        if(this.andarAtual == this.totalAndares){
            System.out.println("Andar maxímo atingido");
        }
        else{
            this.andarAtual += 1;
        }
    }
    void descer(){
        if(this.andarAtual == 0){
            System.out.println("Impossivel descer");
        }
        else{
            this.andarAtual -= 1;
        }
    }
}