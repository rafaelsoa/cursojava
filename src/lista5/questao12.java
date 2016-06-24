
//Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. 
//O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
//Tabuada de 5:
//5 X 1 = 5
//5 X 2 = 10
//...
//5 X 10 = 50

package lista5;

import java.util.Scanner;

/**
 *
 * @author a965866
 */
public class questao12 {
    public static void main(String[] args) {
       
       Scanner entrada = new Scanner (System.in);
       System.out.println ("Informe um número");
       int x = entrada.nextInt();
        for(int y = 0; y <= 10; y++)
        System.out.println(x+"X"+y+"="+x*y);
    }
}

