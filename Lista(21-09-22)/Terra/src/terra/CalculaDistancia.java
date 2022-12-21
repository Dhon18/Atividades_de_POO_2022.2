package terra;
public class CalculaDistancia {
   
    private float distancia;
    
    CalculaDistancia(){
    
    }
    CalculaDistancia(float dist){
     this.distancia = dist;   
    }
    
    float getDistancia(){
        return this.distancia;
    }
    
    void setDistancia(float distancia){
        this.distancia = distancia;
    }
    
    double CalculaMilhas(){
        
        return this.distancia/1.609;
        
    }
    
    double calculaPes(){
        
        return this.distancia*3281;
    }
    
    
}
