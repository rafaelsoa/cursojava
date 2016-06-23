//Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de 
//crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. 
//Faça um programa que calcule e escreva o número de anos necessários para que a 
//população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.
package lista5;

import java.util.Scanner;

/**
 *
 * @author a965866
 */
public class questao4 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);
         System.out.println ("Crescimento populacional!");
         int pop1 = 80000;
         int pop2 = 200000; 
         float taxa1 = 0.3f;
         float taxa2 = 0.15f;
         int anos = 1; 
        
        do{
            
            pop1 = (int) (pop1 * taxa1) + pop1; 
            pop2 = (int)(pop2 *taxa2)+ pop2;
            anos++;
            
            
        } while (pop1 < pop2);
                
                System.out.println ("São necessários " + anos + " anos, para a população do  País A ultrapasse a do País B");
               
    }   
}
