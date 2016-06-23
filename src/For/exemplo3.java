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
public class exemplo3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println ("Tabuadeira, insira um número");
        int n1= entrada.nextInt();
        for (int i=0; i<10; i++){
          System.out.println( n1 +  "x " + i + "= " + (n1* i));
          
        }}
    }
