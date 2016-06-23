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
public class questao1 {
    public static void main(String[] args) {
       Scanner soa = new Scanner (System.in);
       System.out.print ("Informe seu salario"); 
       float salario = soa.nextFloat (); 
       float aumento = 0;
       
       if (salario <= 280){
         aumento= 0.2f;
        } else if (salario <=700){
        
//            continuar
        }
    }
}