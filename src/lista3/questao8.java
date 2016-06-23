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
public class questao8 {
    public static void main(String[] args) {
      Scanner soa = new Scanner (System.in);
        System.out.println ("Informe o preço de três produtos");
        float p1 = soa. nextFloat ();
        float p2 = soa. nextFloat ();
        float p3 = soa.nextFloat ();
       if (p1 <= p2 && p1<= p3){
        System.out.println (p1+ "  é o menor preço ");
       } else if (p2<= p1 && p2<=p3) {
        System.out.println ( p2+ "   é menor preço ");
       }else if (p3<= p1 && p3<=p2) {
        System.out.println ( p3+ "   é o menor preço ");
    }
}     
}
