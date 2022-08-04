/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodosjava;

/**
 *
 * @author Diego
 */
public class OrientadoObjeto {
    
    public static String Contador( int i, int f){
        String str = "";
        for(int con = i; con <= f; con++){
            //System.out.println(con);
            str += con + "";
        }
       return str;
    }
    
}
