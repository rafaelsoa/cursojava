
package condicional.se;

import java.util.Scanner;

public class exemplo5 {
    public static void main(String[] args) {
        Scanner soa = new Scanner (System.in);
        System.out.print("Informe sua média");
        float m = soa.nextFloat ();
        System.out.print ("informe suas faltas: ");
        int f = soa.nextInt();
        if (m>7 && f< 25){
            System.out.println ("Aluno Aprovado");
        }else{
            System.out.println ("Aluno reprovado");
        } 
    }
}
  