/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mediaalunos;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class MediaAlunos {
    
    public static void main(String[] args) {
        /*Para pegar o campo digitado e colocar no terminal, tenho que usar Scanner teclado = new Scanner (System.in);
        e importar a biblioteca import java.util.Scanner;*/
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite seu nome.");
        String nome = teclado.nextLine();
        System.out.println("Qual foi sua primeira nota?");
        Float nota1 = teclado.nextFloat();
        System.out.println("Qual foi sua segunda nota?");
        Float nota2 = teclado.nextFloat();
        Float media = (nota1 + nota2)/2;
        
        if( media >= 6 ){
            System.out.println("Parabens " + nome + ", vc foi aprovado e sua media foi  "+ media); 
        }else{
            System.out.println("Parabens " + nome + ", vc é burro e foi reprovado e sua media foi  "+ media);
        }
    }
}
