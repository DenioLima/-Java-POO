/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programarepeticao02;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Repeticao02 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ate quanto vc quer que conte?");
        int quantidade = teclado.nextInt();
         for(int con = 0; con <= quantidade; con++){
             System.out.println(con);
         }
         System.out.println("Acabou a contagem!");
    }
}
