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
public class numeroprimo2 {
   
  public static void main(String[] args) {
       // limite dos números primos (incluindo)
      Scanner entrada = new Scanner (System.in);
    System.out.println ("Insira um número"); 
    int limite = entrada.nextInt ();
    System.out.println("Numeros primos entre 2 e " + limite + ": ");
    
        for(int i = 1; i <= limite; i++){
        int primo = 0;
                       
     
       
       
       for(int j = 1; j <= i ; j++){
         if(i % j == 0){
           primo++; // não é primo
          
         }
       }
    
       if(primo==2){
         System.out.print(i + " ");
       }
    }
    
   
  }
}