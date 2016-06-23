/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional.se;

import java.util.Scanner;

/**
 *
 * @author a965866
 */
public class Exemplo4 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        
        System.out.println ("Nota 1");
        float n1 = entrada.nextFloat ();
        System.out.println ("Nota 2");
        float n2 = entrada.nextFloat ();
        System.out.println ("Nota 3");
        float n3 = entrada.nextFloat ();
        
        float Media = (n1*4+n2*5+n3*6)/15 ;
        
        System.out.println ("Média" + "=" + Media);
        
        if (Media <3){
            System.out.println("Reprovado");
        } else if (Media < 7 )  {
            System.out.println ("Recuperação");
        }else {
            System.out.println ("Aprovado"); 
        }
        
        if ( Media > 3 && Media < 7 ){
            System.out.println ("Nota de Recuperação");
            float n4 = entrada.nextFloat (); 
        } else {
            System.out.println ("Boas Férias!!");
        }
//        if (n4 = )
        
}
}

//    private static void If(boolean b) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
