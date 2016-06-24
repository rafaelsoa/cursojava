/*Faça um programa que receba dois números inteiros e gere 
os números inteiros que estão no intervalo compreendido por eles

 */
package lista5;

import java.util.Scanner;

/**
 *
 * @author a965866
 */
public class quetsao10 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
       
        
            System.out.println ("Informe um número");
            int n1 = entrada.nextInt ();
            System.out.println ("Informe outro número");
            int n2 = entrada.nextInt ();
           
//            int cont1 = 1+ n1; 
//            int cont2 = 1+ n2;
//         
//            for (int i = n1; i < (n2-1); i++) {  
//             if (n1<n2){
//               cont1++ ;   
//               System.out.println( cont1 - 1 );
//            
//            }else{
//                cont2++; 
//                System.out.println( cont2 -1 );  
//            }     
            int aux=0;
            if (n1>n2) {
                aux = n2;
                n2 = n1;
                n1 = aux;
            }
            int soma=0;
            for (int i = n1; i <= n2; i++) {
                System.out.println(i);
                soma += i;
                
                       
            }
            System.out.println ("a soma é" + soma);
      }
}

