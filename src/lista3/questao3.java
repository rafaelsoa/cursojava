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
public class questao3 {
    public static void main(String[] args) {
        Scanner soa = new Scanner (System.in);
        System.out.println ("Informe F para feminino ou M para masculino");
        String sexo = soa.next ();
        if (sexo.equalsIgnoreCase("m") ){
        System.out.println ("Masculino");
    }else if (sexo.equalsIgnoreCase("f")){
        System.out.println ("Feminino");
    }else {
        System.out.println ("Sexo Inválido"); 
    }
    }
}
