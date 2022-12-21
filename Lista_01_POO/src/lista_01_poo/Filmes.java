package lista_01_poo;
public class Filmes {
    private String titulo, categoria;
private float preco;

Filmes(String tit, String cat){
    this.titulo = tit;
    this.categoria = cat;
    
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

void setTitulo(String tit){
    this.titulo = tit;
}

void setCategoria(String cat){
    this.categoria = cat;
}

void setPreco(float prec){
    this.preco = prec;
    }
}