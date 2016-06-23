/*Faça um programa que leia 5 números e informe a soma e a média dos números.
 */
package lista5;

import java.util.Scanner;

/**
 *
 * @author a965866
 */
public class questao8 {
       public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println ("Informe 5 números");
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        int n3 = entrada.nextInt();
        int n4 = entrada.nextInt();
        int n5 = entrada.nextInt();
        int soma = n1 + n2 + n3+ n4 + n5; 
        int media = (n1 + n2 + n3+ n4 + n5)/5; 
        

        System.out.println("A soma é " + soma + " e a media é "+ media); 
     
        }
    }


