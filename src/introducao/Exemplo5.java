
package introducao;

import java.util.Scanner;

public class Exemplo5 {
    
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        
        System.out.println ("Português");
        float pt = entrada .nextFloat ();
        System.out.println ("Matematica");
        float mat = entrada .nextFloat ();
        System.out.println ("História");
        float his = entrada .nextFloat ();
        System.out.println ("Ciências");
        float cie = entrada .nextFloat ();
        
        float Media = ((pt+mat+his+cie)/4);
        
        System.out.println ("Média" + "="+ pt + "+" + mat + "+" + his + "+" +cie + "=" + Media);
    }
}
