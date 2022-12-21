/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_14_09_2022;
public class Calculo {
    double largura, altura;
    
    public double area(){
     return largura * altura;   
    }
    public double perimetro(){
        return 2*(altura * largura);
    }
    public double diagonal(){
        return Math.sqrt(altura*altura + largura * largura);
    }
}
        
