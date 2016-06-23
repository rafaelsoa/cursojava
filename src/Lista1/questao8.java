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
public class questao8 {
    public static void main(String[] args) {
        Scanner soa = new Scanner (System.in);
        System.out.println (" Quanto você ganha por mês?");
        System.out.println ("Insira aqui o valor de sua hora trabalhada");
        float v1 = soa. nextFloat ();
        System.out.println ("Insira quantas horas você trabalha por mês");
        float h1 = soa.nextFloat ();
        float valor = v1*h1;
        System.out.println ("Seu salário do mês é " + valor+ " reais");
        
    }
}
