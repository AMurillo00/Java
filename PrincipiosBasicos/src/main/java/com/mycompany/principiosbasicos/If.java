/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.principiosbasicos;

/**
 *
 * @author alber
 */
public class If {
    
    public static void main(String[] args) {
        
        if (5 > 4){
            System.out.println("5 es mayor que 4");
        }
        
        if (5 < 4){
            System.out.println("5 es menor que 4");
        }
        
        int edad = 17;
        
        if (edad < 18 && edad >= 0){
            System.out.println("Eres menor de edad");
        }
        else if (edad >= 18){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Esa no es una edad valida");
        }
    }
    
}
