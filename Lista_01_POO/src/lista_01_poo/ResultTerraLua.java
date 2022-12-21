package lista_01_poo;
public class ResultTerraLua {
    
    private float dis;
    
    ResultTerraLua(){
    
    }
    ResultTerraLua(float dist){
     this.dis = dist;   
    }
    
    float getDis(){
        return this.dis;
    }
    
    void setDis(float dis){
        this.dis = dis;
    }
    
    double CalculaMilhas(){
        
        return this.dis/1.609;
        
    }
    
    double calculaPes(){
        
        return this.dis*3281;
    }
    
}