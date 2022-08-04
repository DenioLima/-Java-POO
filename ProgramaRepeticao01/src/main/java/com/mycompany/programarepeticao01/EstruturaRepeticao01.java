/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programarepeticao01;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class EstruturaRepeticao01 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite quantos numeros sera a contagem");
        int quantidade = teclado.nextInt();
        int contador = 0;
        
        while(contador <= quantidade){
            System.out.println(contador);
            contador++;
        }
        
    }
}
