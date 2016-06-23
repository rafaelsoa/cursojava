/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;

import java.util.Scanner;

/**
 *
 * @author a965866
 */
public class questao4 {
    public static void main(String[] args) {
        Scanner soa = new Scanner (System.in);
        System.out.println ("Informe uma letra e veja se ela é uma vogal ou consoante");
        String letra = soa.next ();  
        if ( letra.equalsIgnoreCase("a")||
           ( letra.equalsIgnoreCase("e")||
           ( letra.equalsIgnoreCase("i")||
           ( letra.equalsIgnoreCase("o")||
           ( letra.equalsIgnoreCase("u")){
            System.out.println ("Essa letra é uma vogal");
     
        } else {
            System.out.println ("Essa letra é uma consonte");
    }
}
}
