
package introducao;

import java.util.Scanner;


public class Exemplo6 {
    
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        
        System.out.println ("Nota 1");
        float n1 = entrada.nextFloat ();
        System.out.println ("Nota 2");
        float n2 = entrada.nextFloat ();
        System.out.println ("Nota 3");
        float n3 = entrada.nextFloat ();
        
        float Media = (n1*4+n2*5+n3*6)/15 ;
        
        System.out.println ("Média" + "=" + Media);
    }
}
