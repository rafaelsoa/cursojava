/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;

import java.util.Scanner;

/**
 *
 * @author A965866
 */
public class questao1 {
    public static void main(String[] args) {
        Scanner soa = new Scanner (System.in);
        System.out.println ("Insira um número inteiro");
        int n1 = soa.nextInt();
        System.out.println ("Insira outro número inteiro");
        int n2 = soa.nextInt();
        System.out.println ("insira um número real ");
        float n3 = soa.nextFloat ();
        float a = (n2/2)*(n1*2);
        float b = 3*n1 + n3; 
        float c = n3*n3*n3;
        System.out.println ("O produto do dobro do primeiro com metade do segundo= " + a);
        System.out.println ("A soma do triplo do primeiro com o terceiro= " + b);
        System.out.println ("o terceiro elevado ao cubo.= " + c);
    }
}
