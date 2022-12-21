package sala;
public class Tv {

    private int volume, canalAtual;
    
    Tv(){
        this.volume = 0;
        this.canalAtual = 1;
    }
    
    int getVolume(){
        return volume;
    }
    int getcanalAtual(){
        return canalAtual;
    }
    void setVolume(int v){
        if(v > 50 || v < 0){
            System.out.println("Impossivel fazer a operação");
        }
        else{
            this.volume = v;
        }
    }
    void setCanalAtual(int c){
        if(c <= 0){
            System.out.println("canal inexistente");
        }
        else{
            this.canalAtual = c;
        }
    }
    
    public String toString(){
        return "Volume da Tv: "+this.volume+"\nCanal atual: "+this.canalAtual;
    }
    
    void aumentaVolume(){
        if(this.volume == 50){
            System.out.println("Impossivel aumentar mais. Limite maxímo atingido");
        }
        else{
            this.volume += 1;
        }
        
    }
    void abaixaVolume(){
        if(this.volume == 0){
            System.out.println("Impossivel abaixar mais. Limite minímo atingido");
        }
        else{
            this.volume -= 1;
        }
    }
    void sobeCanal(){
        this.canalAtual += 1;
    }
    void desceCanal(){
        if(this.canalAtual == 1){
            System.out.println("canal inexistente");
        }
        else{
            this.canalAtual -= 1;
        }
    }
    
}
