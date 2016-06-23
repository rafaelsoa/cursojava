/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class questao6 {
    public static void main(String[] args) {
        Scanner soa = new Scanner (System.in);
        System.out.println ("Informe o metro quadrado a ser pintado");
        float area= soa .nextFloat ();
        float tinta = area/3;
        float lata=  (float) Math.ceil(tinta/18);
        float preco = lata * 80;
        System.out.println ("qtd de Latas " + lata);
        System.out.println ("Valor " + preco);
}
        
    }


