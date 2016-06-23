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
public class questao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String nome="usuario", senha="12345";
        do {
             System.out.println ("Informe Nome e Senha");
             nome = entrada.next();
             senha = entrada.next();
 
             if (senha.equals(nome)) {
                 System.out.println("USUARIO == SENHA");
             }
             
        } while (nome.equals(senha)); 
          
    }
}
