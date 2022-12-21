package locadorafilmes;
public class Filmes {

private String titulo, categoria;
private float preco;

Filmes(String t, String c){
    this.titulo = t;
    this.categoria = c;
    
    int acre = 0;
    
    if(categoria.equals("Infantil") ||categoria.equals("Promoção")){
        acre = 2;
    }
    else{
        acre = 3;
    }
    this.preco = 4 + acre;
    
}

Filmes(){
   
}


String getTitulo(){
    return this.titulo;
}
String getCategoria(){
    return this.categoria;
}
float getPreco(){
    return this.preco;
}

void setTitulo(String t){
    this.titulo = t;
}
void setCategoria(String c){
    this.categoria = c;
}
void setPreco(float p){
    this.preco = p;
}
    
}
