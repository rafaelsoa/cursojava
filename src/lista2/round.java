/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;

/**
 *
 * @author a965866
 */
    public class round {
 
   public static void main(String[] args) {
 
   // VALOR A SER ARREDONDADO
   double valor = 1.5248;
 
   // GRAVA NA VARIAVEL O ARREDONDADO EM UMA VARIAVEL
   double valor_arred = Math.round(valor);
 
   // GRAVA NA VARIAVEL O VALOR ARREDONDADO PRA CIMA
   double valor_arred_cima = Math.ceil(valor);
 
   // GRAVA NA VARIAVEL O VALOR ARREDONDADO PRA CIMA
   double valor_arred_baixo = Math.floor(valor);
 
   // IMPRIME O VALOR ARREDONDADO
   System.out.println("Valor Inicial: "+valor);
   System.out.println("Valor Arredondado: "+valor_arred);
   System.out.println("Valor Arredondado p/ cima: "+valor_arred_cima);
   System.out.println("Valor Arredondado p/ baixo: "+valor_arred_baixo);
 
   }
 
}

