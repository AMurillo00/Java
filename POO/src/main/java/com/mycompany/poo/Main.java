package com.mycompany.poo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        persona1.nombre = "Alberto";
        persona1.apellido = "Murillo";
        persona1.edad = 22;
        persona1.estado = "Casado";
        
        System.out.println("Persona 1 datos: " + persona1.nombre + " "
        + persona1.apellido);
        
        System.out.println("Edad de Persona 1: " + persona1.edad);
        
        System.out.println(persona1.cumple());
        
        persona1.cambioEstado("Soltero");
        System.out.println(persona1.estado);
        
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Manzana");
        lista.add("Pera");
        lista.add("Piña");
        
        System.out.println(lista);
    }
}
