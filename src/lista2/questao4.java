/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class questao4 {
    public static void main(String[] args) {
        Scanner soa = new Scanner (System.in);
        System.out.println ("Insira o peso do Peixe, só utilize o valor inteiro!");
        int peso = soa.nextInt ();
        int multa = 4;
        int excesso = 50;
        float multaE = (peso - excesso) *multa; 
        if (peso >= excesso){
            System.out.println ("Multa no valor de "+"R$" +multaE);
            System.out.println ("Excesso de peso = "+ (peso - excesso) +"kg");
        }else{
            System.out.println ("Multa no valor de R$ 0,00");
            System.out.println ("Excesso de peso = 0 kg");
         
        
        }
       
        
            
        
    }
}
