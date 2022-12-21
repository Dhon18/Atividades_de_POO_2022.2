package povo;
public class Pessoa {

   
     
private String nome;
private int dataNascimento;
private float altura;

 Pessoa(String nome){
        this.nome = nome;
    }
 
 Pessoa(String nome, int dataNascimento){
     this.nome = nome;
     this.dataNascimento = dataNascimento;
             
 }
 
String getNome(){
    return this.nome;
}
int getDataNascimento(){
    return this.dataNascimento;
}
float getAltura(){
    return this.altura;
}

void setNome(String nome){
    this.nome = nome;
}
void setDataNascimento(int ano){
    this.dataNascimento = ano;
}
void setAltura(float altura){
    this.altura = altura;
}
public String toString(){
    return "Nome: "+this.nome+"\nData de nascimento: "+this.dataNascimento+"\nAltura: "+this.altura;
}
int idade(){
    return 2022 - this.dataNascimento;
}
    
}
