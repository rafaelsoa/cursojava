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
public class questao5 {
    public static void main(String[] args) {
        Scanner soa = new Scanner (System.in);
        System.out.println ("Informe sua nota parcial 1");
        float nota1 = soa.nextFloat ();
        System.out.println ("Informe sua nota parcial 2");
        float nota2 = soa.nextFloat ();
        float media = (nota1 + nota2) / 2;
        
       // Condicional para calcular a média
        if (media >= 7 && media != 10 && media < 9){
         System.out.println ("Aprovado");  
         }else if( media == 10){
         System.out.println ("Aprovado com distinção"); 
         }else if (media <7 && media >=0){
         System.out.println ("Reprovado"); 
        
       // Nota inserida de maneira errada
         }else{
         System.out.println ("Nota inválida");
         System.exit(0);
    }
             
        
    }
}
