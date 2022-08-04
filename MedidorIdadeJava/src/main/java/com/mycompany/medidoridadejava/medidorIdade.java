/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.medidoridadejava;


import java.util.Scanner;


/**
 *
 * @author Diego
 */
public class medidorIdade {
    
    public static void main(String[] args) {
        
        Scanner teclado =  new Scanner (System.in);
        System.out.println("Digite seu nome.");
        String nome = teclado.nextLine();
        System.out.println("Digite o ano do nascimento");
        int dtNasc = teclado.nextInt();
        int idade = 2022 - dtNasc;
        System.out.println(idade);
        
        if(idade < 12){
            System.out.println("Parabens " + nome + ". Vc é esta cagando verde!");
        }else if(idade >= 12 && idade <18){
            System.out.println("Parabens " + nome + ". Esta na hora de arrumar um serviço!");
        }else if(idade >= 18 && idade <28){
            System.out.println("Parabens " + nome + ". Vc esta na flor da idade, oq esta fazendo de bom?");
        }else if(idade >= 28 && idade <40 ){
            System.out.println("Parabens " + nome + ". A idade esta chegando, não se cozinha com uma agua só!");
        }else if(idade >= 40 && idade <60){
            System.out.println("Parabens " + nome + ". Vc ja esta ancião!");
        }else if(idade >= 60 && idade <80){
            System.out.println("Parabens " + nome + ". Não levante os braços que o pessoal de cima ti leva!");
        }else{
            System.out.println("Parabens " + nome + ". Esta na hora de voltar pra casa!");
        }
        
    }
    
}
