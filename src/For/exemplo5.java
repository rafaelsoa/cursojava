/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package For;

import java.util.Scanner;

/**
 *
 * @author a965866
 */
public class exemplo5 {
     public static void main(String[] args){
    
        Scanner soa = new Scanner(System.in);
        int num, fat = 1;
      
            System.out.println("Digite um nº");
            num = soa.nextInt();
            String imprimir = "";
            for(int i = 1;i <= num; i++){
            if (i==1){      
                imprimir +=  i;
            }else {
                imprimir += i + "x" ;
            }            
                fat *= i;
            }            
            System.out.println( num + "!= " + imprimir + " = " + fat);

            
     }
    }
