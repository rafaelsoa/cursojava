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
public class exemplo1 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
//        criaçao de um vetor criado numero que tem 10 posições. 
        int numeros []=new int [10];
        String nome []= new String [10];
//        int numeros [] = {2,7,4,-3,15,33};
////      vetores - posição do -3 é a posição 3. do 0 que se inicia a contagem de vetores  
//        System.out.println(numeros[3]);
//        for (int i =0; i<6; i++){
//        use o length quando nao quiser qdt de numeros num vetor
        for (int i =0; i<numeros.length; i++){
//         System.out.println (numeros[i]);
            
            System.out.println("Digite o múmero" + (i+1) + ":");
            numeros[i] =  entrada.nextInt();
            
        }
        for (int i =(numeros.length-1); i >=0; i--){
         System.out.println ("-->" + numeros [i]);
        }
        
        }
    }


