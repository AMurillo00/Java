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
public class While {
    public static void main(String[] args) {
        
        int numero = 10;
        
        while(numero < 10){
            System.out.println(numero);
        }
        
        numero = 0;
        while(numero < 10){
            numero ++;
            System.out.println(numero);
        }
    }
}
