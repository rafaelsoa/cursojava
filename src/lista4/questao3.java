/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4;

import java.util.Scanner;

/**
 *
 * @author a965866
 */
public class questao3 {
    public static void main(String[] args) {
         Scanner soa = new Scanner (System.in);
         System.out.println ("Dia da semana");
         int dia = soa.nextInt ();
         
         switch (dia){
             case 1 :
                 System.out.println ("1-Domingo");
                 break;
             case 2 :
                 System.out.println ("2-Segunda");
                 break;
             case 3 :
                 System.out.println ("3-Terça");
                 break;
             case 4 :
                 System.out.println ("4-Quarta");
                 break; 
              case 5 :
                 System.out.println ("5-Quinta");
                 break;
             case 6 :
                 System.out.println ("6-Sexta");
                 break;
             case 7 :
                 System.out.println ("7-Sábado");
                 break;    
                 
                 
         }
    }
}
