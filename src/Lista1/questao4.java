/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author A965866
 */
public class questao4 {
    public static void main(String[] args) {
        Scanner soa= new Scanner (System.in);
        System.out.println ("Nota 1");
        Float n1 = soa.nextFloat (); 
        System.out.println ("Nota 2");
        Float n2 = soa.nextFloat (); 
        System.out.println ("Nota 3");
        Float n3 = soa.nextFloat (); 
        System.out.println ("Nota 4");
        Float n4 = soa.nextFloat (); 
        
        Float media = (n1+n2+n3+n4)/ 4;
        System.out.println ("Média= " + media);
    }
}
