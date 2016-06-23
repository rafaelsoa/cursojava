
package lista2;

import java.util.Scanner;


public class questao2 {
    public static void main(String[] args) {
        Scanner soa = new Scanner (System.in);
        System.out.println ("Insira sua altura para verificar seu peso ideal");
        float altura = soa.nextFloat ();
        float n1 =  (float)72.7;
        float ideal = (n1 * altura ) - 58;
        System.out.println ("Peso ideal= " + ideal + "Kg" );
    }
 
}
