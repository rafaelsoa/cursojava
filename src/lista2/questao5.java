/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class questao5 {
    public static void main(String[] args) {
        Scanner soa= new Scanner (System.in);
        System.out.println (" Quanto você ganha por mês?");
        System.out.println ("Insira aqui o valor de sua hora trabalhada");
        float v1 = soa. nextFloat ();
        System.out.println ("Insira quantas horas você trabalha por mês");
        float h1 = soa.nextFloat ();
        float bruto = v1*h1;
        float inss = bruto * 0.08f;
        float ir = bruto * 0.11f;
        float sind = bruto * 0.05f;
       
        float liquido = (float) (bruto - (inss+ir+sind));
       
        System.out.println ("Seu salário do mês é " + liquido + " reais");
    }
}
