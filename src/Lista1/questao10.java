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
public class questao10 {
    public static void main(String[] args) {
        Scanner soa = new Scanner (System.in) ; 
        System.out.println ("Conversor de Celsius em Farenheit");
        System.out.println ("Insira a temperatura em Celsius");
        float c1 = soa.nextFloat (); 
        float f1 = ((c1/5)*9)+ 32;
        System.out.println ("A temperatura em Farenheit é " + f1 + " F°");
    }
}
