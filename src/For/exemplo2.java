/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package For;

import java.util.Scanner;

/**
 *
 * @author a965866
 */
public class exemplo2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero = 0, soma=0;
        for (int i=1; i<=5; i++){
        System.out.print("Digite um número" + i + ":" );
        numero = entrada.nextInt ();
        soma += numero;
        }
        System.out.println ("Soma: "+ soma);
    }
}
