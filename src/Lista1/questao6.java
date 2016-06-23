/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

import java.util.Scanner;

/**
 *
 * @author A965866
 */
public class questao6 {
    public static void main(String[] args) {
        Scanner soa = new Scanner (System.in);
        System.out.println ("Calculo da área de um círculo");
        System.out.println ("Insira o raio");
        float raio = soa.nextFloat ();
        System.out.println ("Insira a unidade de medida");
        String unidade = soa.next();   
        float pi = (float) 3.14; 
        float area = (raio*raio)* pi;
        System.out.println ("Área =" + area + unidade+"²");
       
        
    }
}
