//Altere o programa anterior permitindo ao usuário informar as populações e 
//as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.
// */
package lista5;

import java.util.Scanner;

/**
 *
 * @author a965866
 */
public class questao5 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);
         System.out.println ("Crescimento populacional! Informe a população do seus países e as taxas de crescimento");
         System.out.println ("População do país A");
         int pop1 = entrada.nextInt();
         System.out.println ("Taxa de crescimento populacional do país A");
         float taxa1 = entrada.nextFloat();
         System.out.println ("População do país B");
         int pop2 = entrada.nextInt(); 
         System.out.println ("Taxa de crescimento populacional do país B");
         float taxa2 = entrada.nextFloat();
         int anos = 1; 
        
        do{
            
            pop1 = (int) (pop1 * taxa1) + pop1; 
            pop2 = (int)(pop2 *taxa2)+ pop2;
            anos++;
            
            
        } while (pop1 < pop2);
                
                System.out.println ("São necessários " + anos + " anos, para a população do  País A ultrapasse a do País B");
               
    }   
}
    

