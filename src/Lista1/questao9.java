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
public class questao9 {
    public static void main(String[] args) {
        Scanner soa = new Scanner (System.in) ; 
        System.out.println ("Conversor de Farenheit em Celsius");
        System.out.println ("Insira a temperatura em Farenheit");
        float f1 = soa.nextFloat (); 
        float c1 = (5*(f1-32)/9);
        System.out.println ("A temperatura em Celsius é " + c1 + " C°");
    }
}