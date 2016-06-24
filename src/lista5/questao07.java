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
        int maior=0;
        
        for (int i = 0; i<5 ; i++){
         System.out.println ("Informe 1 número");
            int n = entrada.nextInt();
            if (n>maior){
            maior = n;
            }
                
        }
        System.out.println ("O número maior é: "+ maior); 
    
       
    }
}
