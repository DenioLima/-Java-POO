/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoswitch;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class dragonBall {
    
    public static void main(String[] args) {
        
        Scanner teclado =  new Scanner (System.in);
        System.out.println("Qual seu personagem favorito em Dragon Ball?");
        System.out.println("1,2,3");
        int numero = teclado.nextInt();
        String pFavorito;
        
        switch (numero){
            case 1:
                pFavorito = "Goku";
                break;
            case 2:
                pFavorito = "Vedita";
                break;
            case 3:
                pFavorito = "Bills";
                break;    
            default:
                pFavorito = "Todos";
        
        }
        System.out.println(pFavorito);
    }
}
