/*Altere o programa anterior para mostrar no final a soma dos números.
 
 */
package lista5;

import java.util.Scanner;

/**
 *
 * @author a965866
 */
public class questao11 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
       
        
            System.out.println ("Informe um número");
            int n1 = entrada.nextInt ();
            System.out.println ("Informe outro número");
            int n2 = entrada.nextInt ();
            
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
            System.out.println ("a soma é  " + soma);
     }
}

            
            
           
//            int cont1 = 1+ n1; 
//            int cont2 = 1+ n2;
//          
//           
//            
//            for (int i = n1; i < (n2-1); i++) {  
//             if (n1<n2){
//               cont1++ ;
//              
//               System.out.println( cont1 - 1 );
//            
//            }else{
//                cont2++; 
//              
//                 System.out.println( cont2 -1 );  
//                 soma += i; 
//            }     
//  
//                
//                       
//            }
//            System.out.println ("a soma é" + soma);
//
//   
//       }
//      }
//}

