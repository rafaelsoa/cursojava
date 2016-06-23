
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a965866
 */
public class exemplo2 {
    public static void main(String args[]) {
    Scanner entrada = new Scanner (System.in);
    
    
//    System.out.println ("Digite o numero");
//    int n = entrada.nextInt ();
//    int soma = 0, contador = 0;
//    
//    while (numero ! = 0){
//    soma + = numero;
//    contador++;
//    System.out.println ("Digite o numero");
//    int n = entrada.nextInt ();
//    
//    }
    
    
    int numero = 0, soma= 0, contador = 0;
    
    do {
        System.out.print ("Digite um numero");
        numero = entrada.nextInt ();
        soma += numero;
        contador++;
    }
        while ( numero != 0);
       
        float media = soma/(contador - 1); 
        
        System.out.println ("Soma " + soma + " \n Média " + media );
    }
}

