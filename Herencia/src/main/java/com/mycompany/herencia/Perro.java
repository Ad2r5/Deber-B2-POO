package com.mycompany.herencia;

public class Perro extends Animal {
    String raza;
    int edad;
    Perro(String tipo, String raza){
        super(tipo,edad);
        this.raza=raza;
        this.edad=edad;
        
    }
    void ladrar(){
        System.out.println("Guau guau-Soy un " +raza);
    }
    public int ProcesoEdad(){
        if (edad<=3){
            System.out.println("A su perro le faltan 4 vacunas");
        }else{
            if(edad>=3){
                System.out.println("Asu perro le faltan 3 vacunas");
            }
        }
        return edad;
    }
}
