/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturarepeticaoWhile;

import java.util.Scanner;

/**
 *
 * @author a965866
 */
public class exempl1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String resposta = "não";
        int tentativa = 0;
        while (!resposta.equalsIgnoreCase("sim")){
            System.out.print("Eu sou bonito?");
            resposta = entrada.next();
            tentativa++;
        }
        
        System.out.println ("Parabéns, você acertou na " + tentativa + "ª vez");
    }
}
