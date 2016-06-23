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
public class questao5 {
    public static void main(String[] args) {
         Scanner soa= new Scanner (System.in);
         System.out.println ("Conversor de Metros em Centímetros");
         System.out.println ("Insira sua medida abaixo");
         float n1 = soa.nextFloat();
         float conversao = 100 * n1 ;
         System.out.println (conversao +"cm");
         
    }
}
