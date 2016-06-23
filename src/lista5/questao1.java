/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista5;

import java.util.Scanner;

/**
 *
 * @author a965866
 */
public class questao1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero = -1;
        do {
            System.out.println ("Informe um número entre 0 e 10");
            numero = entrada.nextInt();
        } while (numero < 0 || numero > 10);
    
    }

}