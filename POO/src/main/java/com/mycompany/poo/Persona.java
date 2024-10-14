package com.mycompany.poo;


public class Persona {
    
    String nombre;
    String apellido;
    int edad;
    String estado;
    
    //void cumple(){
    //    System.out.println("La persona " + nombre + " ha cumplido " + (edad + 1));
    //}
    
    int cumple(){
        return edad + 1;
    }
    
    void cambioEstado(String nuevoEstado){
        System.out.println("Nuevo estado: " + nuevoEstado);
    }
    
}
