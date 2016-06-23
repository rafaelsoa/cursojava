package introducao;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println ("Digite um número inteiro:");
        int inteiro = entrada.nextInt ();
        System.out.println("Numero inteiro:" +inteiro);
        System.out.println("Digite um número decimal:");
        float decimal = entrada.nextFloat ();
        System.out.println("Numero decimal:"+decimal);
//        System.out.println               
        char caractere = (char) entrada.nextByte();
        System.out.println("Caractere: "+ caractere);
        
      System.out.println ("Informe seu Nome:");
//      String nome
    }
}
