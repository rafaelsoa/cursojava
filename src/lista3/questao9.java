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
public class questao9 {
    public static void main(String[] args) {
      Scanner soa = new Scanner (System.in);
        System.out.println ("Informe  três numeros");
        float n1 = soa. nextFloat ();
        float n2 = soa. nextFloat ();
        float n3 = soa.nextFloat ();
     if (n1 >= n2 && n2>= n3 ){
        System.out.println ("O Número " + n1+","+ n2+","+n3);
       } else if (n2 >= n1 && n1>= n3) {
        System.out.println ("O Número " + n2+","+ n1+","+n3);
       }else if (n3>= n1 && n1>=n2) {
        System.out.println ("O Número " + n3+","+ n1+","+n2);   
       } else if (n3>= n2 && n2>=n1) {
        System.out.println ("O Número " + n3+","+ n2+","+n1);
       }else if (n1>= n3 && n3>=n2) {
        System.out.println ("O Número " + n1+","+ n3+","+n2);
      }else if (n2>= n3 && n3>=n1) {
        System.out.println ("O Número " + n2+","+ n3+","+n1);
}
}
}
                                                    