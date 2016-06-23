/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;

import java.util.Scanner;

/**
 *
 * @author a965866
 */
public class teste3 {
    public static void main(String[] args) {
        Scanner soa = new Scanner(System.in);
        System.out.println ("Informe o tamanho do arquivo: ");
        float tamanho = soa.nextFloat();
        System.out.print ("informe a sua velocidade: ");
        float velocidade = soa.nextFloat();
        float tempo= (tamanho/(velocidade/8f)) / 60f;
        System.out.println ("Tempo: " + tempo); 
        
      
    }
}
