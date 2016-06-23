
package lista2;

import java.util.Scanner;


public class questao3 {
    public static void main(String[] args) {
        Scanner soa = new Scanner (System.in);
        System.out.println ("Qual seu peso ideal?");
        System.out.println ("Informe seu sexo!!");
        String sexo = soa.next();
        
        float n1 =  (float)72.7;
        float n2 = (float) 62.1;
        float n3 = (float) 44.7;
        switch (sexo){
            case "masculino": case "Masculino": case "Macho": case "M": case "homem": case "Homem":
                System.out.println ("Informe sua Altura!!");
                float alturaM = soa.nextFloat ();
                float ideal = (n1 * alturaM ) - 58;            
                System.out.println ("Seu peso ideal é "+ ideal + "Kg");
                System.out.println ("Insira seu peso");
                float pesom = soa.nextFloat ();
                if (pesom > ideal){
                    System.out.println ("Vamos perder essse bucho? Peso acima do ideal!! ToT");
                 
                }else{
                    System.out.println ("Ta trincado? heim?");
                }
                break;
                
            case "Feminino": case "feminino": case "mulher": case "Mulher": case "fêmea":
                System.out.println ("Informe sua Altura!!");
                float alturaF = soa.nextFloat ();
                float idealf = (n2 * alturaF ) - n3;            
                System.out.println ("Seu peso ideal é "+ idealf + "Kg");
                System.out.println ("Insira seu peso");
                float pesof = soa.nextFloat ();
                if (pesof > idealf){
                    System.out.println ("Vamos ficar gostosa? Peso acima do ideal!! ToT");
                 
                }else {
                    System.out.println ("Ta uma belezura? heim?");
                }
                break;
            default:
                System.out.println ("Sexo Invalido");
                System.exit(0);
        }
        
        
     
    }
}
