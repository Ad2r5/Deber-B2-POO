package com.mycompany.herencia;

import java.util.Scanner;

public class Proyecto02 {

    public static void main(String args) {
        Scanner teclado =new Scanner(System.in);
        int edad;
        System.out.println("Ingrese la edad del Perro: ");
        edad=teclado.nextInt();
        Perro p = new Perro("Mamimefero", "Labrador",edad);
        p.Describir();
        p.ladrar();
        p.Edad();
        
    }

}
