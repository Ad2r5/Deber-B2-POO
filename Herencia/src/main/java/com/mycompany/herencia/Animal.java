
package com.mycompany.herencia;


public class Animal {
    String tipo;
    int edad;
    
    public Animal(String tipo,int edad){
        this.tipo=tipo;
        this.edad;
        
    }
    void Describir(){
        System.out.println("El tipo es: "+tipo);
    }
    void Edad(){
        if(edad<=3){
            System.out.println("Su perro es Joven");
        }else{
            if(edad>=3.1){
                System.out.println("Su perro ya es Adulto");
            }
        }
            
    }
}
