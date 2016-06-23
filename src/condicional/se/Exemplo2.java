
package condicional.se;

import java.util.Scanner;


public class Exemplo2 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Informe o número:");
        int numero = entrada.nextInt();
        if (numero>=0) {
            System.out.println("Número Positivo");
            
        } else {
            System.out.println("Número Negativo");
        }
        
    }
    
}
