
package introducao;

import java.util.Scanner;

public class Exemplo3 {
    
    public static void main(String[] args) {
           Scanner entrada = new Scanner (System.in);
           System.out.println("Informe o primeiro número:");
           Float num1 = entrada.nextFloat ();
           System.out.println("Informe o segundo número:");
           Float num2 = entrada.nextFloat ();
           int soma = (int) (num1 + num2);
           System.out.println("Resultado=" + soma );
           
}
    }
    
