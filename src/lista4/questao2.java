/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4;

import java.util.Scanner;

/**
 *
 * @author a965866
 */
public class questao2 {
    public static void main(String[] args) {
      Scanner soa = new Scanner (System.in);
      System.out.println ("Informe valor da hora"); 
      float valor_hora = soa.nextFloat ();
      System.out.println ("Informe quantidade de horas"); 
      float qtd_horas = soa.nextFloat (); 
      float salario_bruto = soa.nextFloat (); 
      float ir = 0;
       
       if (salario_bruto <= 900){
             ir=0;    
       } else if (salario_bruto <= 1500){
             ir= 0.5f;         
       } else if (salario_bruto<= 2500){
             ir = 0.1f; 
       } else{
             ir = 0.2f;    
               }
       
       float inss = salario_bruto * 0.1f;
       float fgts = salario_bruto * 0.11f;
       float total_descontos = inss + salario_bruto *ir;
       float salario_liquido = salario_bruto - total_descontos;
       
       System.out.println ("Salário bruto: (" + valor_hora + "*" + qtd_horas + "):" + )
       
       
    }
}
