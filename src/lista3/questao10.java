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
public class questao10 {
    public static void main(String[] args) {
       Scanner soa = new Scanner (System.in);
       System.out.println ("Qual turno você estuda?");
       String turno = soa.next ();
        
       if (turno.equalsIgnoreCase("v") ){
        System.out.println ("Vespertino");
        } else if (turno.equalsIgnoreCase("vespertino")){
        System.out.println ("Vespertino");
        }else if (turno.equalsIgnoreCase("m") ){
        System.out.println ("Matutino");
        } else if (turno.equalsIgnoreCase("matutino")){
        System.out.println ("Matutino");
        } else if (turno.equalsIgnoreCase("n")){
        System.out.println ("Noturno"); 
        } else  if (turno.equalsIgnoreCase("Noturno")){
        System.out.println ("Noturno");
        }else{
        System.out.println ("Turno Inválido"); 
            
  
}
}
}