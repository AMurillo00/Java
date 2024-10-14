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
public class Funciones {
    public static void main(String[] args) {
        
        mostrarMensaje();
        
        saludar("Alberto");
        
        sumar(10, 20);
        System.out.println(sumar(100, 50));
    }
    
    public static void mostrarMensaje(){
        System.out.println("Aprendiendo a Programar con Java");
    }
    
    public static void saludar(String nombre){
        System.out.println("Hola " + nombre);
    }
    
    public static int sumar(int numero1, int numero2){
        int suma = numero1 + numero2;
        
        return suma;
    }
}
