/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;

import java.util.Scanner;

/**
 *
 * @author a965866
 */
public class questao1 {
    public static void main(String[] args) {
        Scanner soa = new Scanner (System.in);
        System.out.println ("Informe dois Nùmeros");
        float n1 = soa. nextFloat ();
        float n2 = soa. nextFloat ();
        if (n1 > n2){
        System.out.println ("O Número " + n1+ "   é maior ");
    } else {
        
        System.out.println ("O Número " + n2+ "   é maior ");
    }
}
}