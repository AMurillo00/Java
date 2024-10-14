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
public class Operadores {
    public static void main(String[] args) {
        
        int suma = 5 + 4;
        int resta = 5 - 4;
        int multiplicacion = 5 * 4;
        int division = 10 / 2;
        int resto = 10 % 3;
        
        System.out.println("Suma = " + suma);
        System.out.println("Resto de la división = " + resto);
        
        int numero = 10;
        System.out.println(numero);
        
        numero++;
        System.out.println(numero);
        
        numero--;
        System.out.println(numero);
        
        System.out.println(5 == 4);
        
        System.out.println(5 > 4 && 4 < 5);
        System.out.println(10 > 5 && 10 > 15);
        
        System.out.println(5 > 4 || 4 < 5);
        
        System.out.println(10 != 5);
    }
}
