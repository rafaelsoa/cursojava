/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VetoreseMatrizes;

import java.util.Scanner;

/**
 *
 * @author a965866
 */
public class exemplo2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        String nome [] = new String [3];
        int nota [] []= new int [3][4];
        
        for (int  i=0; i < nome.length; i++){
    
            System.out.print ("Nome   " + (i+1) + "  :");
            nome[1] =  entrada.next();
            
        for (int j=0; j<4; j++){
            
            System.out.print ("Nota  " + (j+1)+ "   de   " + nome [i]+ " :");
            nota [i][j]= entrada.nextInt(); 
            
       
        }
    }
//          for (int i=0, i < nome.length; i++){
//              
//           System.out.println("Média de "+ nome [i]);  
//              
//          for (int j=0, j < nota.length ); j++){
          
        
//          System.out.println("Média " + (nota[0][0] + nota [0][1]+ nota [0][2] + nota[0][3])/4 );
//          System.out.println("Média " + (nota[1][0] + nota [1][1]+ nota [1][2] + nota[1][3])/4 );
//          System.out.println("Média " + (nota[2][0] + nota [2][1]+ nota [2][2] + nota[2][3])/4 );
        
        
        
        float medias [] = new float  [3]; 
        int z = 0;
        
        while (z<3) {
        medias [z] = (nota[z][0] + nota [z][1]+ nota [z][2] + nota[z][3])/4 ;
        
        if (medias [z]>= 7){
            System.out.println (nome [z] + " Aprovado");
            
        } else{
            System.out.println (nome [z] + " Reprovado");
        }
        z++; 
        }
           
          }       
                    
          }     
           
                     
    

