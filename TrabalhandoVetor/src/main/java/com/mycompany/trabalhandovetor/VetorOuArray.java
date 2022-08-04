/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhandovetor;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author Diego
 */
public class VetorOuArray {
    public static void main(String[] args ) {
        int n[] = {4,7,11,13};
        System.out.println("Total de casas nesse array e " +n.length);
        
        for(int con = 0; con < n.length; con++){
            System.out.println("Na posição "+ con +" temos "+n[con]);
        }
        
        //Vou usar um For each,esse for each se usa so com array e se distngue pelo tamanho e pelo os : ao inves dos ;
        double num[] = {1,3,5,7.5,8.3,10,-5,-3.6,-1.1}; 
        for(double valor: num){
            //quero tbm deixalos em orden crescente,´para isso vou ter q importar import java.lang.reflect.Array;
            Arrays.sort(num);
            System.out.println(valor);
        }
        String familia[] = {"Denio","Diego","Jadir","Lica"};
        for (String nome: familia){
            System.out.println(nome);
        };
        //Quero achar a posição dentro do array, para isso vou usar Arrays.binarySearch( , );
        int bonitao = Arrays.binarySearch(familia,"Denio");
        System.out.println("Encontrei o mais bonitão na posição " + bonitao);
        
        //Quero fazer um array com 10 casas tudo igual com o numero 7,para isso vou usar a clase Arrays.fill( , );
        int nume[]= new int[10];
        Arrays.fill(nume,7);
        for(int val:nume){
            System.out.println(val);
        };
        
    }
}
