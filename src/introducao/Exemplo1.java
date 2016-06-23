package introducao;

import java.util.Scanner;

public class Exemplo1 {
    
    public static void main(String[] args) {
        
     
        Scanner entrada = new Scanner (System.in);
        
        String nome;
        
        System.out.println ("Qual seu nome ?");
        
        nome = entrada.next();
        
        System.out.println("Bem vindo, "+nome+"!!!");
    }
   
    
    }
