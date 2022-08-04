/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodosjava;

/**
 *
 * @author Diego
 */
public class Metodos {
    //Fazendo uma chamada pra minha função. A função sempre tem retorno
    static int Soma(int a, int b){
        int s = a + b;
        System.out.println("A soma e " + s);
        return s;
    }
    
    //Fazendo a chamada do meu procedimento
    static void Subtracao(int c, int d){
        int sub = c - d;
        System.out.println("A subtração e " + sub);
    }
    
    public static void main(String[] args) {
        System.out.println("Vou chamar minha função");
        Soma(5,2);
        System.out.println("vou chamar meu procedimento");
        Subtracao(5,2);
        System.out.println("Vou chamar minha outra classe");
        System.out.println(OrientadoObjeto.Contador(1, 10));
    }
}
