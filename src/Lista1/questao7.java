/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

import java.util.Scanner;

/**
 *
 * @author A965866
 */
public class questao7 {
    public static void main(String[] args) {
        Scanner soa= new Scanner (System.in);
        System.out.println ("Cálculo da área de um quadrado");
        System.out.println ("Insira medida do lado do quadrado");
        float n1 = soa.nextFloat ();
        System.out.println ("Insira a unidade de medida");
        String unidade = soa.next ();
        float area = n1 * n1;
        System.out.println ("Área do quadrado= "+ area+ unidade+"²");
        System.out.println ("O dobro da área de seu quadrado é "+ 2*area + unidade+ "²");
    }
}
