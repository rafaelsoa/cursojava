/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista5;

import java.util.Scanner;

/**
 *
 * @author a965866
 */
public class questao07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println ("Informe 5 números");
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        int n3 = entrada.nextInt();
        int n4 = entrada.nextInt();
        int n5 = entrada.nextInt();
        
        if (n1> n2 && n1 > n3 && n1 > n4 && n1 > n5){
        System.out.println("O número maior é " + n1); 
        } else if (n2> n1 && n2 > n3 && n2 > n4 && n2 > n5){
        System.out.println ("O número maior é " + n2);
        } else if (n3> n1 && n3 > n2 && n3 > n4 && n3 > n5){
        System.out.println ("O número maior é " + n3);
        } else if (n4> n1 && n4 > n2 && n4 > n3 && n4 > n5){
        System.out.println ("O número maior é " + n4);
        }else {
        System.out.println ("O número maior é " + n5);
        }
    }
}
